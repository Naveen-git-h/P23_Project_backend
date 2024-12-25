package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Laptops;

public interface LaptopsRepo extends JpaRepository<Laptops, Long> {

}
