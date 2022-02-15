package com.oms.order.service;

import java.security.NoSuchAlgorithmException;

import com.oms.order.model.Customer;
import com.oms.order.exception.AuthenticationFailedException;

public interface AccountService {

	Customer authentication(String username, String password) 
			throws NoSuchAlgorithmException, AuthenticationFailedException;
	Long addCustomer(Customer customer) throws NoSuchAlgorithmException;
}
