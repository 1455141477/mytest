package com.domain;

import org.junit.Before;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Reader implements Serializable {
    private int readerid;
    private String name;
    private int age;
    private String sex;
    private String phone;
    private String dept;
    private Date regdate;
    private String username;
    private String password;
    private List<BorrowBook> borrowBooks=new ArrayList<>();
    @Before
    public void init(){
        borrowBooks=new ArrayList<>();
    }

    public List<BorrowBook> getBorrowBooks() {
        return borrowBooks;
    }

    public void setBorrowBooks(BorrowBook borrowBook) {
        borrowBooks.add(borrowBook);
    }

    @Override
    public String toString() {
        return "Reader{" +
                "readerid=" + readerid +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", phone='" + phone + '\'' +
                ", dept='" + dept + '\'' +
                ", regdate=" + regdate +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", borrowBooks=" + borrowBooks +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getReaderid() {
        return readerid;
    }

    public void setReaderid(int readerid) {
        this.readerid = readerid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getRegdate() {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(this.regdate);
    }

    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }
}
