package com.example.demo.stock;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Stock {
	
	@Id
	@SequenceGenerator(
			name = "stock_sequence",
			sequenceName = "stock_sequence",
			allocationSize = 1)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "stock_sequence")
	
	private Long id;
	private String name;
	private String ticker;
	private String description;
	private Double lastPrice;
	private Double high52;
	private Double low52;
	private Double marketCap;
	
	/**
	 * 
	 */
	public Stock() {
	}
	
	/**
	 * @param id
	 * @param name
	 * @param ticker
	 * @param description
	 * @param lastPrice
	 * @param high52
	 * @param low52
	 * @param marketCap
	 */
	public Stock(Long id, String name, String ticker, String description, Double lastPrice, Double high52, Double low52,
			Double marketCap) {
		this.id = id;
		this.name = name;
		this.ticker = ticker;
		this.description = description;
		this.lastPrice = lastPrice;
		this.high52 = high52;
		this.low52 = low52;
		this.marketCap = marketCap;
	}

	/**
	 * @param name
	 * @param ticker
	 * @param description
	 * @param lastPrice
	 * @param high52
	 * @param low52
	 * @param marketCap
	 */
	public Stock(String name, String ticker, String description, Double lastPrice, Double high52, Double low52,
			Double marketCap) {
		this.name = name;
		this.ticker = ticker;
		this.description = description;
		this.lastPrice = lastPrice;
		this.high52 = high52;
		this.low52 = low52;
		this.marketCap = marketCap;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getTicker() {
		return ticker;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getLastPrice() {
		return lastPrice;
	}

	public void setLastPrice(Double lastPrice) {
		this.lastPrice = lastPrice;
	}

	public Double getHigh52() {
		return high52;
	}

	public void setHigh52(Double high52) {
		this.high52 = high52;
	}

	public Double getLow52() {
		return low52;
	}

	public void setLow52(Double low52) {
		this.low52 = low52;
	}
	
	public Double getMarketCap() {
		return marketCap;
	}

	public void setMarketCap(Double marketCap) {
		this.marketCap = marketCap;
	}
}
