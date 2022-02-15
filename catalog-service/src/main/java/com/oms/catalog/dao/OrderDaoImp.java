package com.oms.catalog.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oms.catalog.model.Order;

@Repository
public class OrderDaoImp implements OrderDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Long save(Order order) {
		return (Long) sessionFactory.getCurrentSession().save(order);	
	}

}
