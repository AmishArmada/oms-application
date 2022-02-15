package com.oms.catalog.service;

import java.security.NoSuchAlgorithmException;

import com.oms.catalog.exception.AuthenticationFailedException;
import com.oms.catalog.model.Customer;

public interface AccountService {

	Customer authentication(String username, String password) 
			throws NoSuchAlgorithmException, AuthenticationFailedException;
	Long addCustomer(Customer customer) throws NoSuchAlgorithmException;
}
