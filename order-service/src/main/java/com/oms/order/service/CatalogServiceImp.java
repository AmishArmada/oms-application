package com.oms.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oms.order.dao.ProductDao;
import com.oms.order.exception.ProductNotFoundException;
import com.oms.order.model.Product;

@Service
@Transactional
public class CatalogServiceImp implements CatalogService {

	@Autowired
	ProductDao productDao;

	@Override
	public Product findBy(Long idProduct) throws ProductNotFoundException {
		Product product = productDao.findBy(idProduct);
		if (product != null)
			return product;
		else
			throw new ProductNotFoundException();
	}

	@Override
	public Product findBy(String description) throws ProductNotFoundException {
		Product product = productDao.findBy(description);
		if (product != null)
			return product;
		else
			throw new ProductNotFoundException();
	}

	@Override
	public List<Product> findByCategory(String category) throws ProductNotFoundException {
		List<Product> products = productDao.findByCategory(category);
		if (products.isEmpty() || products == null)
			throw new ProductNotFoundException();
		else
			return products;
	}

	@Override
	public List<Product> findAll() throws ProductNotFoundException {
		List<Product> products = productDao.findAll();
		if (products.isEmpty() || products == null)
			throw new ProductNotFoundException();
		else
			return products;
	}

}
