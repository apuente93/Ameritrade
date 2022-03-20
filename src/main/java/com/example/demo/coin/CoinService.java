package com.example.demo.coin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class CoinService {
	
	public final CoinRepository coinRepository;
	
	@Autowired
	public CoinService(CoinRepository coinRepository) {
		this.coinRepository = coinRepository;
	}
	
	@GetMapping
	public List<Coin> getCoins(){
		return this.coinRepository.findAll();
	}
}
