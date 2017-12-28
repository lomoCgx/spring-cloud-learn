package com.client.repositories;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cloudentity.model.Users;

@SpringBootApplication
@RunWith(SpringJUnit4ClassRunner.class)  
@SpringBootTest(classes=SpringBootJdbcTest.class)// 指定spring-boot的启动类  
public class SpringBootJdbcTest {

	public static void main(String[] args) {  
        SpringApplication.run(SpringBootJdbcTest.class, args);  
   }
	
	@Autowired  
    private UsersRepository userRepository;  
	
	@Test  
    public void findAllUsers()  {  
        List<Users> users = userRepository.findAll();  
        System.out.println(users);  
          

    } 
}
