package com.beingjavaguys.dao;

import java.util.List;

import com.beingjavaguys.domain.Stock;

public interface StockDao {
	
	public void save(Stock stock);
	public void update(Stock stock);
	public void delete(Stock stock);
	Stock findByStockCode(String stockCode);
	public List getStockList();
}
