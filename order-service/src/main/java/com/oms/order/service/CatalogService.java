package com.oms.order.service;

import java.util.List;

import com.oms.order.exception.ProductNotFoundException;
import com.oms.order.model.Product;

public interface CatalogService {

	Product findBy(Long idProduct) throws ProductNotFoundException;
	Product findBy(String description) throws ProductNotFoundException;
	List<Product> findByCategory(String category) throws ProductNotFoundException;
	List<Product> findAll() throws ProductNotFoundException;
	
}
