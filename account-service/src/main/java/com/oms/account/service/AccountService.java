package com.oms.account.service;

import java.security.NoSuchAlgorithmException;

import com.oms.account.model.Customer;
import com.oms.account.exception.AuthenticationFailedException;

public interface AccountService {

	Customer authentication(String username, String password) 
			throws NoSuchAlgorithmException, AuthenticationFailedException;
	Long addCustomer(Customer customer) throws NoSuchAlgorithmException;
}
