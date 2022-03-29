package com.example.ameritrade.stock;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StockConfig {
	
	@Bean
	CommandLineRunner commandLineRunner(StockRepository stockRepository) {
		return args -> {
			Stock amd = new Stock("Advanced MicroDevices", "AMD", "test", 115.52, 150.0, 82.23, 10000000000000.78);
			Stock apple = new Stock("Apple Inc", "APPL", "test", 115.52, 150.0, 82.23, 10000000000000.78);
			
			stockRepository.saveAll(List.of(amd, apple));
		};
	}
	
}
