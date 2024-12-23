package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Login;
import com.example.repo.LoginRepo;

@Service
public class ExcelrService {

	@Autowired
	private LoginRepo loginRepo;
	
	
	public Login saveUser(Login login) {
		return loginRepo.save(login);
	}
	
}
