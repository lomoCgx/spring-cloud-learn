package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.User;

@RestController
public class TestController {

    @Autowired
    DiscoveryClient discoveryClient;


    @GetMapping("/dc")
    public String dc() {
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        System.out.println("dcO");
        return services;
    }
    
    @PostMapping("/user/queryUser")
    @CrossOrigin(allowCredentials="true", allowedHeaders="*", methods={RequestMethod.GET,  
            RequestMethod.POST, RequestMethod.DELETE, RequestMethod.OPTIONS,  
            RequestMethod.HEAD, RequestMethod.PUT, RequestMethod.PATCH}, origins="*")  
    public User queryUser(@RequestParam String username,@RequestParam String password) {

    	System.out.println("username="+username+";password="+password);
    	User user = new User();
    	user.setId(1L);
    	user.setUsername("lomo");
    	user.setPassword("cgx123");
        return user;
    }
    
    @GetMapping("/users")
    @CrossOrigin(allowCredentials="true", allowedHeaders="*", methods={RequestMethod.GET,  
            RequestMethod.POST, RequestMethod.DELETE, RequestMethod.OPTIONS,  
            RequestMethod.HEAD, RequestMethod.PUT, RequestMethod.PATCH}, origins="*")  
    public User getUser(String username,String password) {

    	System.out.println("username="+username+";password="+password);
    	User user = new User();
    	user.setId(1L);
    	user.setUsername("lomo");
    	user.setPassword("cgx123");
        return user;
    }
}
