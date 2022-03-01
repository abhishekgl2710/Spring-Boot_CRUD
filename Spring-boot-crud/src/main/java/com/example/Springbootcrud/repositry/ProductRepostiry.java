package com.example.Springbootcrud.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Springbootcrud.entity.Product;

public interface ProductRepostiry extends JpaRepository<Product,Integer> {

	Product findByName(String name);

}
