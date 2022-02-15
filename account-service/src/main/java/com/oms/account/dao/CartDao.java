package com.oms.account.dao;

import com.oms.account.model.Cart;

public interface CartDao {

	Cart findBy(Long idCart);
	Long save(Cart cart);
	void update(Cart cart);
	
}
