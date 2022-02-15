package com.oms.catalog.service;

import java.util.Date;

import com.oms.catalog.dao.CartDao;
import com.oms.catalog.dao.OrderDao;
import com.oms.catalog.dao.ProductDao;
import com.oms.catalog.model.Cart;
import com.oms.catalog.model.LineItem;
import com.oms.catalog.model.Order;
import com.oms.catalog.model.Order.BuilderOrder;
import com.oms.catalog.model.Product;
import com.oms.catalog.util.OrderStatus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrderServiceImp implements OrderService {

	@Autowired
	CartDao cartDao;

	@Autowired
	ProductDao productDao;
	
	@Autowired
	OrderDao orderDao;

	@Override
	public Long save(Cart cart) {
		return cartDao.save(cart);
	}

	@Override
	public void add(Long idCart, Long idProduct, Integer quantity) {
		Cart cart = cartDao.findBy(idCart);
		Product product = productDao.findBy(idProduct);
		cart.getLinesItems().add(new LineItem(cart, product, quantity, product.getPrice()));
		cartDao.update(cart);
	}

	@Override
	public Long ordered(Long idCart) {
		Cart cart = cartDao.findBy(idCart);
		Order order = new BuilderOrder()
				.setCustomer(cart.getCustomer())
				.setOrdered(new Date())
				.setStatus(OrderStatus.NEW.toString())
				.setTotal(cart.calculateTotal())
				.setLinesItems(cart.getLinesItems())
				.build();
		return orderDao.save(order);
	}

}
