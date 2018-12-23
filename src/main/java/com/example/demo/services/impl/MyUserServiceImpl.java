package com.example.demo.services.impl;

import com.example.demo.dao.UserDao;
import com.example.demo.model.User;
import com.example.demo.services.MyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;

@Service
public class MyUserServiceImpl implements MyUserService {

    @Autowired
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User findById(Integer id) {
        return userDao.findById(id);
    }

    @Override
    public User findByNameAndPassword(String name, String password) {
        return userDao.findByNameAndPassword(name,password);
    }

    @Override
    public User findByNameAndPassword_Anno(String name, String password) {
        return userDao.findByNameAndPassword_Anno(name,password);
    }

    @Transactional(rollbackFor={RuntimeException.class, Exception.class})
    @Override
    public void insertUser(HashMap<String, Object> map) {
        userDao.insertUser(map);
    }

    @Override
    public void updateUser(Integer id, String passward) {
        userDao.updateUser(id, passward);
    }
}
