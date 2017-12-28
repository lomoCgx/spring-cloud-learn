package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cloudentity.model.Users;
import com.example.demo.service.TestService;

@RestController
public class TestController {

	@Autowired
	private TestService testService;
    
	@RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
    	System.out.println("test=========================tets");
        return testService.test();
    }
    
	@RequestMapping(value="/query", method=RequestMethod.GET,consumes = "application/json")
    public Users query(){
		System.out.println("======================================================");
        //return testService.queryUsers("1");
		return null;
    }
}
