package com.example.demo.dao;

import com.example.demo.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.HashMap;


@Mapper
@Component(value = "userDao")
public interface UserDao {

    void insertUser(HashMap<String, Object> map);

    void updateUser(@Param("id") Integer id, @Param("password") String password);

    User findById(@Param("id") Integer id);

    @Select(value = "SELECT id, name,password  FROM ay_user WHERE name = #{name} and password = #{password}")
    User findByNameAndPassword_Anno(@Param("name") String name, @Param("password") String password);

    User findByNameAndPassword(@Param("name") String name, @Param("password") String password);


}
