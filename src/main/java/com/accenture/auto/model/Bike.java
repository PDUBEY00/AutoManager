package com.accenture.auto.model;

import com.accenture.auto.model.base.Vehicle;
/**
 * 
 * @author n.mathew.joy
 *
 */
public class Bike extends Vehicle{

	public Bike(String color, double price, String fuelType, int engineSize) {
		super(color, price, fuelType, engineSize);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String sendServiceReminder() {

		return "Service in 3000KM";
	}

}
