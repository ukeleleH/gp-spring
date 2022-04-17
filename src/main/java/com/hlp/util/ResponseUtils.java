package com.hlp.util;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;

public class ResponseUtils {

    public static void download(HttpServletRequest request, HttpServletResponse response, File proposeFile) {
        try(OutputStream bufferOut = new BufferedOutputStream(response.getOutputStream()); InputStream inputStream = new BufferedInputStream(new FileInputStream(proposeFile));) {
            // 设置响应报头
            long fSize = proposeFile.length();
            response.setContentType("application/x-download");
            // Content-Disposition: attachment; filename=WebGoat-OWASP_Developer-5.2.zip
            response.addHeader("Content-Disposition", "attachment; filename=" + URLEncoder.encode(proposeFile.getName(), "UTF-8"));
            // Accept-Ranges: bytes
            response.setHeader("Accept-Ranges", "bytes");
            long pos = 0, last = fSize - 1, sum = 0;//pos开始读取位置;  last最后读取位置;  sum记录总共已经读取了多少字节
            if (null != request.getHeader("Range")) {
                // 断点续传
                response.setStatus(HttpServletResponse.SC_PARTIAL_CONTENT);
                try {
                    // 情景一：RANGE: bytes=2000070- 情景二：RANGE: bytes=2000070-2000970
                    String numRang = request.getHeader("Range").replace("bytes=", "");
                    String[] strRange = numRang.split("-");
                    if (strRange.length == 2) {
                        pos = Long.parseLong(strRange[0].trim());
                        last = Long.parseLong(strRange[1].trim());
                    } else {
                        pos = Long.parseLong(numRang.replace("-", "").trim());
                    }

                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
            long rangLength = last - pos + 1;// 总共需要读取的字节
            // Content-Range: bytes 10-1033/304974592
            String contentRange = new StringBuffer("bytes ").append(pos).append("-").append(last).append("/").append(fSize).toString();
            response.setHeader("Content-Range", contentRange);
            // Content-Length: 1024
            response.addHeader("Content-Length", String.valueOf(rangLength));

            // 跳过已经下载的部分，进行后续下载
            inputStream.skip(pos);
            byte[] buffer = new byte[1024];
            int length = 0;

            while (sum < rangLength) {
                length = inputStream.read(buffer, 0, ((rangLength - sum) <= buffer.length ? ((int) (rangLength - sum)) : buffer.length));
                sum = sum + length;
                bufferOut.write(buffer, 0, length);
            }
            safeClose(inputStream);
            safeClose(bufferOut);
        }
        catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void safeClose(Closeable cls) {
        if (cls != null) {
            try {
                cls.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
