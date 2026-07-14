package com.tka.entity;

public class Z_User {

    private int uid;
    private String uname;
    private String email;

    
    public Z_User() {

    }

    
    public Z_User(int uid, String uname, String email) {
        this.uid = uid;
        this.uname = uname;
        this.email = email;
    }

    

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Z_User [uid=" + uid + ", uname=" + uname + ", email=" + email + "]";
    }

}