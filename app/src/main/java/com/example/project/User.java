package com.example.project;

public class User {
    public String fullName;
    public String email;

    public User() {} // Required by Firebase

    public User(String fullName, String email) {
        this.fullName = fullName;
        this.email = email;
    }
}
