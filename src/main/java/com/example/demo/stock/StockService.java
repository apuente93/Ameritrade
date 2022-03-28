package com.example.demo.stock;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class StockService {
	
	public final StockRepository stockRepository;
	
	@Autowired
	public StockService(StockRepository stockRepository) {
		this.stockRepository = stockRepository;
	}
	
	@GetMapping
	public List<Stock> getStocks(){
		return this.stockRepository.findAll();
	}

	public void addStock(Stock stock) {
		
		Optional<Stock> stockByTicker = this.stockRepository.findByTicker(stock.getTicker());
		
		if (stockByTicker.isPresent()) {
			throw new IllegalStateException("ticker already exists.");
		}
			
		this.stockRepository.save(stock);
	}

	public void deleteStock(Long id) {
		boolean exists = this.stockRepository.existsById(id);
		
		if (!exists) {
			throw new IllegalStateException("id " + id + " does not exist.");
		}
		this.stockRepository.deleteById(id);
	}
}
