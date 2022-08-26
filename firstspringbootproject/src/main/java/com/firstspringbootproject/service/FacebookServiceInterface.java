package com.firstspringbootproject.service;

import java.util.List;

import com.firstspringbootproject.entity.FacebookUser;
import com.firstspringbootproject.entity.Product;

public interface FacebookServiceInterface {

	int createProductService(Product p1);

	List<Product> displayAllProduct();

	int deleteProductService(long l);

	int editProductService(Product p1);

	Product displayProductService(long l);

	int loginService(FacebookUser fb);

}
