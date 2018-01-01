package com.example.demo.service.hystric;

import org.springframework.stereotype.Component;

import com.cloudentity.model.Users;
import com.example.demo.service.TestService;
/**
 * 斷路由
 * @author Lenovo
 *
 */
@Component
public class TestServiceHystric implements TestService{

	@Override
	public String test() {
		return "error";
	}

	@Override
	public Users queryUsers(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
