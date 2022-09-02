package com.firstspringbootproject.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firstspringbootproject.dao.FacebookDAOInterface;
import com.firstspringbootproject.entity.FacebookUser;
import com.firstspringbootproject.entity.Product;

@Service
@Transactional
public class FacebookService implements FacebookServiceInterface{
	
	@Autowired
	private FacebookDAOInterface fd;

	@Override
	public int createProductService(Product p1) {
		int i=0;
		fd.save(p1);
		i=1;
		return i;
	}

	@Override
	public List<Product> displayAllProduct() {
		// TODO Auto-generated method stub
		return fd.findAll();
	}

	@Override
	public int deleteProductService(long l) {
		// TODO Auto-generated method stub
		int i=0;
		fd.delete(l);
		i=1;
		return i;
	}

	@Override
	public int editProductService(Product p1) {
		int i=0;
		fd.saveAndFlush(p1);
		i=1;
		return i;
	}

	@Override
	public Product displayProductService(long l) {
		Product p=fd.findOne(l);
		
		return p;
	}

	@Override
	public int loginService(FacebookUser fb) {
		int i=0;
		FacebookUser f=fd.loginDAO(fb.getEmail(),fb.getPassword());
		if(f!=null) {
			i=1;
		}
		return i;
	}

}







