package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonTestService {

	@Autowired
    RestTemplate restTemplate;
	
	public String dc(String name) {
		System.out.println(name+"=");
        return restTemplate.getForObject("http://SERVICE-HI/dc",String.class);
    }
}
