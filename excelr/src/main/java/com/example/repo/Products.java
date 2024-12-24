package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Products extends JpaRepository<com.example.model.Products, Long> {

}
