package com.example.demo.coin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/coin")
public class CoinController {
	
	private final CoinService coinService;
	
	@Autowired
	public CoinController(CoinService coinService) {
		this.coinService = coinService;
	}
	
	@GetMapping
	public List<Coin> getCoins(){
		return this.coinService.getCoins();
	}
}
