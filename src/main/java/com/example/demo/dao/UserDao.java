package com.example.demo.dao;

import com.example.demo.entity.User;

import java.util.List;

/**
 * Created by Lucem on 27/05/2018.
 */
public interface UserDao {
    void saveUser(User user);
    List<User> getUsers();
    boolean loginUser(User user);
}
