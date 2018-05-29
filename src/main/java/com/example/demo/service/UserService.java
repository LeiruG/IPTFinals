package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

/**
 * Created by Lucem on 26/05/2018.
 */
public interface UserService{
    List<User> getUsers();
    void saveUser(User user);
    boolean login (User user);
}
