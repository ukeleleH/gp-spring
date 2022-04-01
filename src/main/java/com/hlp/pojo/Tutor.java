package com.hlp.pojo;

public class Tutor {
    private long id;

    @Override
    public String toString() {
        return "Tutor{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", tel='" + tel + '\'' +
                ", qq='" + qq + '\'' +
                ", title='" + title + '\'' +
                ", degree='" + degree + '\'' +
                ", isInsideSchool=" + isInsideSchool +
                ", introduction='" + introduction + '\'' +
                '}';
    }

    private String password;
    private String name;
    private char gender;
    private String tel;
    private String qq;
    private String title;
    private String degree;
    private short isInsideSchool;
    private String introduction;

    public long getId() { return id; }

    public void setId(long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public short getIsInsideSchool() { return isInsideSchool; }

    public void setIsInsideSchool(short isInsideSchool) { this.isInsideSchool = isInsideSchool; }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
}
