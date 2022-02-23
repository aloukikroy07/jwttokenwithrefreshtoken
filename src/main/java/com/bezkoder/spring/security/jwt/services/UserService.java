package com.bezkoder.spring.security.jwt.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bezkoder.spring.security.jwt.models.Users;
import com.bezkoder.spring.security.jwt.repository.UserRepo;

@Service
public class UserService {
	
	@Autowired
	UserRepo userRepo;
	
	public List<Users> getAllUsers() {
		List<Users> userData = userRepo.getAllUsers();
		return userData;
	}

}
