package com.oms.account.service;

import java.util.List;

import com.oms.account.exception.ProductNotFoundException;
import com.oms.account.model.Product;

public interface CatalogService {

	Product findBy(Long idProduct) throws ProductNotFoundException;
	Product findBy(String description) throws ProductNotFoundException;
	List<Product> findByCategory(String category) throws ProductNotFoundException;
	List<Product> findAll() throws ProductNotFoundException;
	
}
