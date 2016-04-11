package com.beingjavaguys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.beingjavaguys.domain.Stock;
import com.beingjavaguys.service.StockService;

@Controller
public class StockController {
	@Autowired
	StockService stockService;

	@RequestMapping("/addStock")
	public ModelAndView getForm(@ModelAttribute Stock stock) {
		return new ModelAndView("addStock");
	}
	
	@RequestMapping("registerStock")
	public ModelAndView registerUser(@ModelAttribute Stock stock) {
		stockService.save(stock);
		return new ModelAndView("redirect:stockList");
	}
	
	@RequestMapping("/stockList")
	public ModelAndView getStockData(@ModelAttribute("stock") Stock stock,
			BindingResult result) {
		
		return new ModelAndView("stockList", "stockList", stockService.getStockList());
	}
}
