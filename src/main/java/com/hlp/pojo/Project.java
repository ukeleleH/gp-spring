package com.hlp.pojo;

public class Project {
    private int id;
    private String name;
    private String content;
    private long studentId;
    private long tutorId;
    private String nature;
    private String source;
    private String demand;

    public int getId() { return id; }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public long getTutorId() {
        return tutorId;
    }

    public void setTutorId(long tutorId) {
        this.tutorId = tutorId;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDemand() { return demand; }

    public void setDemand(String demand) { this.demand = demand; }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", studentId=" + studentId +
                ", tutorId=" + tutorId +
                ", nature='" + nature + '\'' +
                ", source='" + source + '\'' +
                ", demand='" + demand + '\'' +
                '}';
    }
}
