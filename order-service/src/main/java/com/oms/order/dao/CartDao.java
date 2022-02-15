package com.oms.order.dao;

import com.oms.order.model.Cart;

public interface CartDao {

	Cart findBy(Long idCart);
	Long save(Cart cart);
	void update(Cart cart);
	
}
