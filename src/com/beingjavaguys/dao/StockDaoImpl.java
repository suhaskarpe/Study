package com.beingjavaguys.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.beingjavaguys.domain.Stock;

@Repository("stockDao")
public class StockDaoImpl implements StockDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void save(Stock stock) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tx = session.beginTransaction();
		session.save(stock);
		tx.commit();
		session.close();
	}

	@Override
	public void update(Stock stock) {
		sessionFactory.getCurrentSession().update(stock);
	}

	@Override
	public void delete(Stock stock) {
		sessionFactory.getCurrentSession().delete(stock);
	}

	@Override
	public Stock findByStockCode(String stockCode) {
		Stock stock = (Stock)sessionFactory.getCurrentSession().load(Stock.class, stockCode);
		return stock;
	}

	@Override
	public List getStockList() {
		Session session = sessionFactory.getCurrentSession();
		return session.createCriteria(Stock.class).list();
	}
}