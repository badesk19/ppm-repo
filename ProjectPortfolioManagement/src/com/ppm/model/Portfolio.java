package com.ppm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ppm_portfolio")
public class Portfolio {

	@Id
	@Column(name="potfolioName")
	private String portfolioName;
	
	@Column(name="portfolioBudget")
	private Double portfolioBudget;
	
	@Column(name="owner")
	private String portfolioOwner;
	
	public Portfolio() {
		
	}
	
	public Portfolio(String portfolioName, Double portfolioBudget,
			String portfolioOwner) {
		super();
		this.portfolioName = portfolioName;
		this.portfolioBudget = portfolioBudget;
		this.portfolioOwner = portfolioOwner;
	}

	public String getPortfolioName() {
		return portfolioName;
	}
	public void setPortfolioName(String portfolioName) {
		this.portfolioName = portfolioName;
	}
	public Double getPortfolioBudget() {
		return portfolioBudget;
	}
	public void setPortfolioBudget(Double portfolioBudget) {
		this.portfolioBudget = portfolioBudget;
	}
	public String getPortfolioOwner() {
		return portfolioOwner;
	}
	public void setPortfolioOwner(String portfolioOwner) {
		this.portfolioOwner = portfolioOwner;
	}
	
	
}
