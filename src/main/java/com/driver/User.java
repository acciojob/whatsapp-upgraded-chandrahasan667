package com.driver;

public class User {
    private String name;
    private String mobile;


   // Constructor-1
    public User() {
    }

    // Constructor-2
    public User(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }

    // Getters and Setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }



}
