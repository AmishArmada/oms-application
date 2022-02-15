package com.oms.catalog.dao;

import com.oms.catalog.model.Customer;

public interface CustomerDao {

	Customer findBy(String username);
	Long save(Customer customer);
	
}
