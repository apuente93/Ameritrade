package com.example.demo.coin;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Coin {
	
	@Id
	@SequenceGenerator(
			name = "coin_sequence",
			sequenceName = "coin_sequence",
			allocationSize = 1)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "coin_sequence")
	private Long id;
	private String name;
	private String description;
	private Double priceUSD;
	private Double priceETH;
	private Long availableSupply;
	private Long totalSuppy;
	private Boolean mintable;
	private Boolean ercToken;
	
	/**
	 * 
	 */
	public Coin() {
	}

	/**
	 * @param id
	 * @param name
	 * @param description
	 * @param priceUSD
	 * @param priceETH
	 * @param availableSupply
	 * @param totalSuppy
	 * @param mintable
	 * @param ercToken
	 */
	public Coin(Long id, String name, String description, Double priceUSD, Double priceETH, Long availableSupply,
			Long totalSuppy, Boolean mintable, Boolean ercToken) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.priceUSD = priceUSD;
		this.priceETH = priceETH;
		this.availableSupply = availableSupply;
		this.totalSuppy = totalSuppy;
		this.mintable = mintable;
		this.ercToken = ercToken;
	}

	/**
	 * @param name
	 * @param description
	 * @param priceUSD
	 * @param priceETH
	 * @param availableSupply
	 * @param totalSuppy
	 * @param mintable
	 * @param ercToken
	 */
	public Coin(String name, String description, Double priceUSD, Double priceETH, Long availableSupply,
			Long totalSuppy, Boolean mintable, Boolean ercToken) {
		this.name = name;
		this.description = description;
		this.priceUSD = priceUSD;
		this.priceETH = priceETH;
		this.availableSupply = availableSupply;
		this.totalSuppy = totalSuppy;
		this.mintable = mintable;
		this.ercToken = ercToken;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPriceUSD() {
		return priceUSD;
	}

	public void setPriceUSD(Double priceUSD) {
		this.priceUSD = priceUSD;
	}

	public Double getPriceETH() {
		return priceETH;
	}

	public void setPriceETH(Double priceETH) {
		this.priceETH = priceETH;
	}

	public Long getAvailableSupply() {
		return availableSupply;
	}

	public void setAvailableSupply(Long availableSupply) {
		this.availableSupply = availableSupply;
	}

	public Long getTotalSuppy() {
		return totalSuppy;
	}

	public void setTotalSuppy(Long totalSuppy) {
		this.totalSuppy = totalSuppy;
	}

	public Boolean getMintable() {
		return mintable;
	}

	public void setMintable(Boolean mintable) {
		this.mintable = mintable;
	}

	public Boolean getErcToken() {
		return ercToken;
	}

	public void setErcToken(Boolean ercToken) {
		this.ercToken = ercToken;
	}
}
