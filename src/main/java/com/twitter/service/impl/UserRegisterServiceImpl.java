package com.twitter.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twitter.model.User;
import com.twitter.service.IUserRegisterService;
import com.twitter.service.repository.UserRepository;
@Service
public class UserRegisterServiceImpl implements IUserRegisterService {
	@Autowired
	private UserRepository repo;
	
	 
	public User saveUser(User u) { 
		return repo.save(u);
	}
 

}
