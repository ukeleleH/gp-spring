package com.hlp.pojo;

public class Student {
    private int id;
    private long sno;
    private String password;
    private String name;
    private char gender;
    private String tel;
    private String major;
    private String class_grade;
    private  int opportunity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getSno() {
        return sno;
    }

    public void setSno(long sno) {
        this.sno = sno;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getTel() { return tel; }

    public void setTel(String tel) { this.tel = tel; }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getClass_grade() {
        return class_grade;
    }

    public void setClass_grade(String class_grade) {
        this.class_grade = class_grade;
    }

    public int getOpportunity() {
        return opportunity;
    }

    public void setOpportunity(int opportunity) {
        this.opportunity = opportunity;
    }

}
