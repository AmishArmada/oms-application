package com.oms.catalog.service;

import java.security.NoSuchAlgorithmException;

import com.oms.catalog.dao.CustomerDao;
import com.oms.catalog.exception.AuthenticationFailedException;
import com.oms.catalog.model.Customer;
import com.oms.catalog.util.ShaHashing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class AccountServiceImp implements AccountService {

	@Autowired
	CustomerDao customerDao;
	
	@Override
	public Customer authentication(String username, String password) 
			throws NoSuchAlgorithmException, AuthenticationFailedException {
		Customer customer = customerDao.findBy(username);
		if(customer.getPassword().equals(ShaHashing.encrypted(password)))
			return customer;
		else
			throw new AuthenticationFailedException();
	}

	@Override
	public Long addCustomer(Customer customer) throws NoSuchAlgorithmException {
		customer.setPassword(ShaHashing.encrypted(customer.getPassword()));
		return customerDao.save(customer);
	}

}
