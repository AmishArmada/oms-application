package com.oms.account.dao;

import com.oms.account.model.Customer;

public interface CustomerDao {

	Customer findBy(String username);
	Long save(Customer customer);
	
}
