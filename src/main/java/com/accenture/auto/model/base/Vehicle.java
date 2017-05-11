package com.accenture.auto.model.base;

import java.io.Serializable;

public abstract class Vehicle implements Serializable, Comparable<Vehicle>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String color;
	private double price;
	private String fuelType;
	private int engineSize;
	/**
	 * 
	 * @param color
	 * @param price
	 * @param fuelType
	 * @param engineSize
	 */
	public Vehicle(String color, double price, String fuelType, int engineSize) {
		super();
		this.color = color;
		this.price = price;
		this.fuelType = fuelType;
		this.engineSize = engineSize;
	}
	
	public abstract String sendServiceReminder();

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	
	public int getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;
	}

	@Override
	public int compareTo(Vehicle o) {
		if(this.getPrice()>o.getPrice()){
			return 1;
		}else{
			return -1;
		}
		
	}
}
