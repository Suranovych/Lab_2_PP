package com.Learn;

public class Student {
    private int id;
    private String surname;
    private String name;
    private String fath;
    private String db;
    private String adress;
    private String phone_num;
    private String faculty;
    private short course;
    private String group;

    public Student(int id,String surname, String name, String fath, String db, String adress, String phone_num, String faculty, short course, String group){
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.fath = fath;
        this.db = db;
        this.adress = adress;
        this.phone_num = phone_num;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }
    public String toSting(){
        return this.surname+" "+this.name+" "+this.fath+","+this.db+","+this.adress+","+this.phone_num+","+this.faculty+","+this.course+","+this.group;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getFath() {
        return fath;
    }

    public void setFath(String fath) {
        this.fath = fath;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;
    }

    public short getCourse() {
        return course;
    }

    public void setCourse(short course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
