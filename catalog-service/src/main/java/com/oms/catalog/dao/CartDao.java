package com.oms.catalog.dao;

import com.oms.catalog.model.Cart;

public interface CartDao {

	Cart findBy(Long idCart);
	Long save(Cart cart);
	void update(Cart cart);
	
}
