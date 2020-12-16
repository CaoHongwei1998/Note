package com.example.mynotes.dao.domain;

public class User {
    private String username;
    private String userid;
    private String password;
    private String userclass;

    public int getUserid() {
        return Integer.parseInt(userid);
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getUserclass() {
        return Integer.parseInt(userclass);
    }

    public void setUserclass(String userclass) {
        this.userclass = userclass;
    }
}
