package com.ashu;

public class IntrestBean {

	private int time;
	private int amount;
	private double intrest;
	
	public void process()
	{
		intrest=(time*amount)*10/100;
	}
	
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public double getIntrest() {
		return intrest;
	}
	public void setIntrest(double intrest) {
		this.intrest = intrest;
	}
	
	
}
