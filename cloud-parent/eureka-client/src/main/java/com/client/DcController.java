package com.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.client.repositories.UsersRepository;
import com.cloudentity.model.Users;


@RestController
public class DcController {

    @Autowired
    DiscoveryClient discoveryClient;
    
    @Autowired  
    private UsersRepository userRepository;

    @GetMapping("/dc")
    public String dc() {
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        
        List<Users> users = userRepository.findAll();  
        System.out.println("users="+users);
        return services;
    }

    @GetMapping(value="/query/{id}")
    public Users queryUsersById(@PathVariable String id) {
    	return userRepository.findUsersById(id);
    }
}
