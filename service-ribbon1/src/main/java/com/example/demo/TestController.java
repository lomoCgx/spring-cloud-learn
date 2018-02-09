package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.UserDao;
import com.example.demo.pojo.User;

@RestController
@RefreshScope
public class TestController {

    @Autowired
    DiscoveryClient discoveryClient;

    
    @Autowired  
    private UserDao userDao;
    
    @Value("${neo.hello}")
    String foo;
    
    @RequestMapping(value = "/hi")
    public String hi(){
        return foo;
    }
    @Transactional
    @GetMapping("/insert")
    public String insert() {
    	
    	User user = new User();
    	user.setUsername("qwe");
    	user.setPassword("222");
    	userDao.insertUser(user);
    	int i=1/0;
    	User user1 = new User();
    	user1.setUsername("qwe22");
    	user1.setPassword("3333");
        userDao.insertUser(user1);
        
    	return "test";
    }
    
    
    @GetMapping("/dc")
    public String dc() {
        String services = "Services: " + discoveryClient.getServices()+" name=";
        System.out.println(services);
        System.out.println(userDao.findAll());
        return services;
    }
}
