package com.firstspringbootproject.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.firstspringbootproject.entity.FacebookUser;
import com.firstspringbootproject.entity.Product;
import com.firstspringbootproject.service.FacebookServiceInterface;

@RestController
public class FacebookController {
	
	
	@Autowired
	private FacebookServiceInterface fs;
	
	
	@GetMapping("loginUser/{loginid}/{password}")
	public String login(@PathVariable("loginid") String lid,@PathVariable("password") String pwd) {
		FacebookUser fb=new FacebookUser();
		fb.setEmail(lid);
		fb.setPassword(pwd);
		
		int i=fs.loginService(fb);
		if(i>0) {
			return "login successfully";
		}
		else {
			return "login fail ";
		}
	}
	
	
	@GetMapping("showAllProduct")
	public List<Product> getAll(){
		return fs.displayAllProduct();
	}
	
	
	@GetMapping("displayProduct/{productid}")
	public Product display(@PathVariable("productid") long l) {
		return fs.displayProductService(l);
	}
	
	@PostMapping("createProduct")
	public String create(@RequestBody Product p1) {
		
		//FacebookServiceInterface fs=new FacebookService();
		
		int i=fs.createProductService(p1);
		
		if(i>0) {
			return "Product created successfully";
		}
		else {
			return "could not create ";
		}
	}
	
	@PutMapping("editProduct/{productid}")
	public String edit(@PathVariable("productid") long l,@RequestBody Product p1) {
		
		p1.setP_id(l);
		int i=fs.editProductService(p1);
		if(i>0) {
			return "Product edited successfully";
		}
		else {
			return "could not edit ";
		}
	}
	
	@DeleteMapping("deleteProduct/{productid}")
	public String delete(@PathVariable("productid") long l) {
		
		int i=fs.deleteProductService(l);
		if(i>0) {
			return "Product deleted successfully";
		}
		else {
			return "could not delete ";
		}
	}

}














