package com.example.demo;

import com.example.demo.model.User;
import com.example.demo.services.MyUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.HashMap;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	private MyUserService userService;

//	@Test
//	public void testfindByNameAndPassword(){
//		User user = userService.findByNameAndPassword("bo","12345");
//		System.out.println("findByNameAndPassword: " + user.getId() + ": " + user.getName());
//
//	}

//	@Test
//	public void testfindByNameAndPassword_Anno(){
//		User user = userService.findByNameAndPassword_Anno("bo","12345");
//		System.out.println("findByNameAndPassword_Anno: " + user.getId() + ": " + user.getName());
//
//	}

	@Test
	public void testInsertUser(){
		HashMap<String, Object> mapUser = new HashMap<String, Object>();
		mapUser.put("id", "6");
		mapUser.put("name", "Xiao1");
		mapUser.put("password", "12345");

		userService.insertUser(mapUser);
//        int a = 1 / 0; //模拟故障

		User user = userService.findById(6);
		System.out.println("findById: " + user.getId() + ": " + user.getName());

	}

	@Test
	public void testUpdateUser(){

		userService.updateUser(6,"789456");
		User user = userService.findById(6);
		System.out.println("findById: " + user.getId() + ": " + user.getPassword());

	}

}

