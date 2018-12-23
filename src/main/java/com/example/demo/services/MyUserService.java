package com.example.demo.services;

import com.example.demo.model.User;

import java.util.HashMap;

public interface MyUserService {

    void insertUser(HashMap<String, Object> map);

    void updateUser(Integer id, String passward);

    User findById(Integer id);
    User findByNameAndPassword(String name, String password);
    User findByNameAndPassword_Anno(String name, String password);

}
