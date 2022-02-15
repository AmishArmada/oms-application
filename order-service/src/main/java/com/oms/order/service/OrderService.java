package com.oms.order.service;

import com.oms.order.model.Cart;

public interface OrderService {

	Long save(Cart cart);
	void add(Long idCart, Long idProduct, Integer quantity);
	Long ordered(Long idCart);

}
