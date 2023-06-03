package com.product.service;

import java.util.List;

import com.product.resource.Product;

public interface ProductServiceInterface {

	List<Product> findAll();
	List<Product> findByCategory(String category);
	Product findById(int id);
}
