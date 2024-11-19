package com.example.Finance;

public class Financing {

	private Double totalAmount;
	private Double income;
	private Integer months;
	
	public Financing() {
	}

	public Financing(Double totalAmount, Double income, Integer months) {
		validationFinancing(totalAmount, income, months);
		this.totalAmount = totalAmount;
		this.income = income;
		this.months = months;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		validationFinancing(totalAmount, income, months);
		this.totalAmount = totalAmount;
	}

	public Double getIncome() {
		return income;
	}

	public void setIncome(Double income) {
		validationFinancing(totalAmount, income, months);
		this.income = income;
	}

	public Integer getMonths() {
		return months;
	}

	public void setMonths(Integer months) {
		validationFinancing(totalAmount, income, months);
		this.months = months;
	}
	
	public double entry() {
		return totalAmount * 0.2;
	}
	
	public double quota () {
		return (totalAmount - entry()) / months;
	}
	
	public void validationFinancing(Double totalAmount, Double income, Integer months) {

		double valuePerMonth = totalAmount * 0.8 / months;
		if (valuePerMonth > income / 2.0) {
			throw new IllegalArgumentException("A parcela não pode ser maior que a metade da renda");
		}
	}

}
