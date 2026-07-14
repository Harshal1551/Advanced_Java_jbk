package com.tka.service;

import java.util.List;

import com.tka.dao.ZomatoDao;
import com.tka.entity.Z_User;

public class ZomatoService {

    public List<Z_User> getUsers() {

        ZomatoDao dao = new ZomatoDao();

        List<Z_User> users = dao.getUsers();

        return users;
    }

}