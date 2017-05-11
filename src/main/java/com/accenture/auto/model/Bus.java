package com.accenture.auto.model;

import com.accenture.auto.model.base.Vehicle;
/**
 * 
 * @author n.mathew.joy
 *
 */
public class Bus extends Vehicle{
	

	public Bus(String color, double price, String fuelType, int engineSize) {
		super(color, price, fuelType, engineSize);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	public String sendServiceReminder() {
		return "Service in 6000KM";
	}

}
