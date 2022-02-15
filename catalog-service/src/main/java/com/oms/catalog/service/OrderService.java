package com.oms.catalog.service;

import com.oms.catalog.model.Cart;

public interface OrderService {

	Long save(Cart cart);
	void add(Long idCart, Long idProduct, Integer quantity);
	Long ordered(Long idCart);

}
