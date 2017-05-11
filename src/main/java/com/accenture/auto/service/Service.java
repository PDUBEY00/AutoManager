package com.accenture.auto.service;

import java.util.HashMap;
import java.util.List;

import com.accenture.auto.model.base.Vehicle;

public interface Service {
	/**
	 * 
	 * @return
	 */
	public HashMap<String,List<Vehicle>> getVehicleDetails();
	/**
	 * 
	 * @param vehicleDetails
	 */
	public void saveVehicleDetails(HashMap<String,List<Vehicle>> vehicleDetails);
}
