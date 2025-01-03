package com.example.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Login;
import com.example.repo.LoginRepo;
import com.example.service.ExcelrService;


@RestController
@CrossOrigin("*")
public class ExcelrController {
	
	
	@Autowired
    private LoginRepo loginRepo; 
	
	@Autowired
	private ExcelrService excelrService;
     
	
	//login
	
	@PostMapping("/login")
	public ResponseEntity<Map<String, String>> login(@RequestBody Map<String, String> loginData){
		String username = loginData.get("username");
		String password = loginData.get("password");
		
		Optional<Login> login = loginRepo.findByUsername(username);
		
		if (login.isPresent() && login.get().getPassword().equals(password)) {
			
//			String token = jwtUtil.generateToken(username);
			
			Map<String, String> response = new HashMap<>(); 
			response.put("login", "success");
//			response.put("token", token);
			response.put("role", login.get().getRole());
			return ResponseEntity.ok(response);
		}
		
		Map<String, String> response = new HashMap<>();
		response.put("login", "fail");
		return ResponseEntity.status(401).body(response);
	}
	
	
	 //Register
	
    @PostMapping("/register")
    public Login register(@RequestBody Login login) {
    	return excelrService.saveUser(login);
    }
}
