package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.RibbonTestService;

@RestController
public class DcCntroller {

	 @Autowired
	 RibbonTestService ribbonTestService;
	 
	 @RequestMapping(value = "/hi")
	    public String hi(@RequestParam String name){
	        return ribbonTestService.dc(name);
	    }
}
