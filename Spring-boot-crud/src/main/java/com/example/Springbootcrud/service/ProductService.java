package com.example.Springbootcrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Springbootcrud.entity.Product;
import com.example.Springbootcrud.repositry.ProductRepostiry;

@Service
public class ProductService {
	@Autowired
	private ProductRepostiry productRepostiry;
	
	public Product saveProduct(Product product)
	{
		return productRepostiry.save(product);
		
	}
	
	public List<Product> saveProducts(List<Product> products)
	{
		return productRepostiry.saveAll(products);
	}
	
	public List<Product> getProducts(){
		return productRepostiry.findAll();
	}
	
	
	  public Optional<Product> getProductById(int id) { 
		  return productRepostiry.findById(id);
	  }
	 
	public Product getProductbyName(String name) {
		return productRepostiry.findByName(name);
		
	}
	
	public String deleteProduct(int id)
	{
		productRepostiry.deleteById(id);
		return "Product Removed!!!";
	}
	public Product updateProduct(Product product)
	{
		Product ep = productRepostiry.findById(product.getId()).orElse(null);
		ep.setName(product.getName());
		ep.setQuantity(product.getQuantity());
		ep.setPrice(product.getPrice());
		return productRepostiry.save(ep);
			
	}
}
