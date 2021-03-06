package com.example.ameritrade.stock;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {

	Optional<Stock> findByTicker(String ticker);
	
}
