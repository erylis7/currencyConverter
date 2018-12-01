package com.example.currency.model;

public class CurrencySetGet {
	private String union;
	private Double total;
	
	public CurrencySetGet (String union, Double total) {
		this.union = union;
		this.total = total;	
	}

	public String getUnion() {
		return union;
	}

	public void setUnion(String union) {
		this.union = union;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
}
