package com.oms.order.dao;

import com.oms.order.model.Customer;

public interface CustomerDao {

	Customer findBy(String username);
	Long save(Customer customer);
	
}
