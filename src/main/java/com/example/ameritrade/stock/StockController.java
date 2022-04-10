package com.example.ameritrade.stock;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(path = "api/v1/stock")
public class StockController {
	
	private final StockService stockService;
	
	@Autowired
	public StockController(StockService stockService) {
		this.stockService = stockService;
	}
	
	@GetMapping
	public List<Stock> getStocks(){
		return this.stockService.getStocks();
	}
	
	@PostMapping
	public void addStock(@RequestBody Stock stock) {
		this.stockService.addStock(stock);
	}
	
	@DeleteMapping(path = "{id}")
	public void deleteStock(@PathVariable(value = "id") Long id) {
		this.stockService.deleteStock(id);
	}
}
