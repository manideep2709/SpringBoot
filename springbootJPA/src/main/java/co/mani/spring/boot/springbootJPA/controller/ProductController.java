package co.mani.spring.boot.springbootJPA.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.mani.spring.boot.springbootJPA.entity.Product;
import co.mani.spring.boot.springbootJPA.repository.Productrepository;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	Productrepository repository;
	
	@GetMapping
	public Iterable<Product> getProduct(){
		
		return repository.findAll();
		
	}
	
	@PostMapping
	public Product create(@RequestBody Product product) {
		
		return repository.save(product);
	}
	@GetMapping("/{id}")
	public Optional<Product> getProduct(@PathVariable("id") Long id) {
		
		return repository.findById(id);
		
	}
	

}
