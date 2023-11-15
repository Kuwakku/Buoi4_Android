package com.example.buoi4_android;

import androidx.annotation.NonNull;

public class User {

    private String userName, address, avatar, email;
    private int age;

    public User() {

    }

    public User(String userName, String address, String avatar, String email, int age) {
        this.userName = userName;
        this.address = address;
        this.avatar = avatar;
        this.email = email;
        this.age = age;
    }

    public String getUseName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "useName='" + userName + '\'' +
                ", address='" + address + '\'' +
                ", avatar='" + avatar + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
