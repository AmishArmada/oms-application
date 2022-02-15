package com.oms.account.service;

import com.oms.account.model.Cart;

public interface OrderService {

	Long save(Cart cart);
	void add(Long idCart, Long idProduct, Integer quantity);
	Long ordered(Long idCart);

}
