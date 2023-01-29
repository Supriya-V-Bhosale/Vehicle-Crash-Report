package com.nissan.lib;

public class FixedDeposit {
	private double principle;
	private int timeinYear;
	private double rate=0.04;
	public FixedDeposit(){
	
	}
	public double getPrinciple() {
		return principle;
	}
	public void setPrinciple(double principle) {
		this.principle = principle;
	}
	public int getTimeinYear() {
		return timeinYear;
	}
	public void setTimeinYear(int timeinYear) {
		this.timeinYear = timeinYear;
	}
	public double getRate() {
		return rate;
	}
	public String getInterestRate()
	{
		return "4%";
	}
	
	
}
