package com.example.demo.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cloudentity.model.Users;
import com.example.demo.service.hystric.TestServiceHystric;

@FeignClient(value = "service-hi",fallback=TestServiceHystric.class)
public interface TestService {

	@RequestMapping(value = "/dc",method = RequestMethod.GET)
    public String test();
	
	@RequestMapping(value="/query/{id}", method=RequestMethod.GET)
	public Users queryUsers(@PathVariable("id") String id);
}
