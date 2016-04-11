package com.beingjavaguys.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Stock implements Serializable {

	private static final long serialVersionUID = 7870782869606178859L;
	
	@Column(name="stock_name")
	String stockName;
	
	@Id
	@GeneratedValue
	Long stockId;
	
	@Column(name="stock_code")
	String stockCode;
	
	Stock() {}
	
	Stock(String stockName, String stockCode) {
		this.stockName = stockName;
		this.stockCode = stockCode;
	}
	
	@Override
	public String toString() {
		return "Stock [stockCode=" + stockCode + ", stockId=" + stockId
				+ ", stockName=" + stockName + "]";
	}	
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public Long getStockId() {
		return stockId;
	}
	public void setStockId(Long stockId) {
		this.stockId = stockId;
	}
	public String getStockCode() {
		return stockCode;
	}
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
}