package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Airpods;
import com.example.model.Homeapp;
import com.example.model.Ipads;
import com.example.model.Laptops;
import com.example.model.Login;
import com.example.model.Mobiles;
import com.example.model.Watches;
import com.example.repo.AirpodsRepo;
import com.example.repo.HomeappRepo;
import com.example.repo.IpadsRepo;
import com.example.repo.LaptopsRepo;
import com.example.repo.LoginRepo;
import com.example.repo.MobilesRepo;
import com.example.repo.WatchesRepo;

@Service
public class ExcelrService {

	@Autowired
	private LoginRepo loginRepo;
	
	@Autowired
	private LaptopsRepo laptopsRepo;
	
	@Autowired
	private MobilesRepo mobilesRepo;
	
	
	@Autowired
	private WatchesRepo watchesRepo;
	
	@Autowired
	private AirpodsRepo airpodsRepo;
	
	@Autowired
	private HomeappRepo homeappRepo;
	
	
	@Autowired
	private IpadsRepo ipadsRepo;
	
	
	//Register Page
	public Login saveUser(Login login) {
		return loginRepo.save(login);
	}
	
	
	public List<Laptops> findAllLaptops(){
		return laptopsRepo.findAll();
	}
	
	public List<Mobiles> findAllMobiles(){
		return mobilesRepo.findAll();
	}
	
	public List<Ipads> findAllIpads(){
		return ipadsRepo.findAll();
	}
	
	public List<Airpods> findAllAirpods(){
		return airpodsRepo.findAll();
	}
	
	public List<Watches> findAllWatches(){
		return watchesRepo.findAll();
	}
	
	public List<Homeapp> findAllHomeapp(){
		return homeappRepo.findAll();
	}
	
}
