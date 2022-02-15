package com.oms.order.dao;

import java.util.List;

import com.oms.order.model.Product;

public interface ProductDao {

	Product findBy(Long idProduct);
	Product findBy(String description);
	List<Product> findByCategory(String category);
	List<Product> findAll();
	
}
