package com.example.demo.coin;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CoinConfig {
	
	@Bean
	CommandLineRunner commandLineRunner(CoinRepository coinRepository) {
		return args -> {
			Coin bitcoin = new Coin("Bitcoin", "Satoshi Gem", 3000.0, 1.0, 1000L, 1000L, false, false);
			Coin ethereum = new Coin("Ethereum", "Vitalik gem", 3000.0, 1.0, 1000L, 1000L, true, true);
			
			coinRepository.saveAll(List.of(bitcoin, ethereum));
		};
	}
	
}
