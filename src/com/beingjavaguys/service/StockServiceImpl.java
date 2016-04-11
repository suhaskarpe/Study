package com.beingjavaguys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.beingjavaguys.dao.StockDao;
import com.beingjavaguys.domain.Stock;

@Service
@Transactional(propagation = Propagation.SUPPORTS , readOnly = true)
public class StockServiceImpl implements StockService {
	
	@Autowired
	StockDao stockDao;
	
	public void setStockDao(StockDao stockDao) {
		this.stockDao = stockDao;
	}
	
	@Override
	public void save(Stock stock) {
		stockDao.save(stock);
	}

	@Override
	public Stock findByStockCode(String stockCode) {
		return stockDao.findByStockCode(stockCode);
	}

	@Override
	public void update(Stock stock) {
		stockDao.update(stock);
	}

	@Override
	public void delete(Stock stock) {
		stockDao.delete(stock);
	}

	@Override
	public List getStockList() {
		return stockDao.getStockList();
	}
}