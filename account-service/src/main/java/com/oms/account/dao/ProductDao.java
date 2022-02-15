package com.oms.account.dao;

import java.util.List;

import com.oms.account.model.Product;

public interface ProductDao {

	Product findBy(Long idProduct);
	Product findBy(String description);
	List<Product> findByCategory(String category);
	List<Product> findAll();
	
}
