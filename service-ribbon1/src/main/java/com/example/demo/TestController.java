package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.UserDao;

@RestController
public class TestController {

    @Autowired
    DiscoveryClient discoveryClient;

    
    @Autowired  
    private UserDao userDao;

    @GetMapping("/dc")
    public String dc() {
        String services = "Services: " + discoveryClient.getServices()+" name=";
        System.out.println(services);
        System.out.println(userDao.findAll());
        return services;
    }
}
