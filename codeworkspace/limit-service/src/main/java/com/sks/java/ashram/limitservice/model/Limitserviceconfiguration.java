package com.sks.java.ashram.limitservice.model;

public class Limitserviceconfiguration {
	
	private int minimum;
	private int maximum;
	
	public Limitserviceconfiguration() {
		
	}
	public Limitserviceconfiguration(int minimum, int maximum) {
		super();
		this.minimum = minimum;
		this.maximum = maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	
	
	

}
