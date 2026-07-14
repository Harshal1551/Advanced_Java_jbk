package com.tka.dao;

import java.util.ArrayList;
import java.util.List;

import com.tka.entity.Z_User;

public class ZomatoDao {

    public List<Z_User> getUsers() {

        List<Z_User> users = new ArrayList<>();

        users.add(new Z_User(101, "Harshal", "jay@gmail.com"));
        users.add(new Z_User(102, "Rahul", "rahul@gmail.com"));
        users.add(new Z_User(103, "Amit", "amit@gmail.com"));
        users.add(new Z_User(104, "Neha", "neha@gmail.com"));
        users.add(new Z_User(105, "Priya", "priya@gmail.com"));

        return users;
    }

}