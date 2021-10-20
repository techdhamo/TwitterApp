package com.twitter.controller; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*; 

import com.twitter.model.User;
import com.twitter.service.IUserRegisterService;

@RestController
@RequestMapping("user")
public class TwitterController {
	@Autowired
	private IUserRegisterService service;
 
	@PostMapping("signup")
	User signup(@RequestBody User u) {
		return  service.saveUser(u);
	}
}

 
 