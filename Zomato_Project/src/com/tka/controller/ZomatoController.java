package com.tka.controller;

import java.util.List;

import com.tka.entity.Z_User;
import com.tka.service.ZomatoService;

public class ZomatoController {

    public static void main(String[] args) {

        ZomatoService service = new ZomatoService();

        List<Z_User> users = service.getUsers();

        for (Z_User user : users) {
            System.out.println("----------------------------");
            System.out.println("User Id   : " + user.getUid());
            System.out.println("User Name : " + user.getUname());
            System.out.println("Email     : " + user.getEmail());
        }
    }

}