package com.beingjavaguys.service;

import java.util.List;

import com.beingjavaguys.domain.Stock;

public interface StockService {
	
	void save(Stock stock);
	
	void update(Stock stock);
	
	void delete(Stock stock);
	
	List getStockList();
	
	Stock findByStockCode(String stockCode); 
}
