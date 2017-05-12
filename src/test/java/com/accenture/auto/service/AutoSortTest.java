package com.accenture.auto.service;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.accenture.auto.model.Car;
import com.accenture.auto.model.base.Vehicle;


public class AutoSortTest {
	
	private List<Vehicle> vehicleList;
	
	@BeforeTest
	public void setup(){
		vehicleList = new ArrayList<Vehicle>();
	}
	
//	@Test(expectedExceptions = )
//	public void toCompareToMethodImplemented(){
//		
//	}
	
	@Test
	public void isVehicleListEmpty() {
		// Given
		returnEmptyList();
		// When
		Collections.sort(vehicleList);
		// Than
		assertEquals(vehicleList.size(), 0);
	}
	
	
	
	@Test
	public void isVehicleListSorted(){
		
		// Given
		populateVehicleList();
		// When
		Collections.sort(vehicleList);
		// Than
		assertEquals(vehicleList.get(0).getPrice(), 23000);
	}
	
	
	
	private List<Vehicle> populateVehicleList(){
		
		Vehicle focus = new Car("Red", 27000, "Petrol", 1600);
		Vehicle insignia = new Car("Red", 23000, "Petrol", 2000);
		Vehicle audi = new Car("Red", 44000, "Diesel", 2000);
		Vehicle BMW = new Car("Red", 48000, "Diesel", 2000);
		
		vehicleList.add(focus);
		vehicleList.add(insignia);
		vehicleList.add(audi);
		vehicleList.add(BMW);
		
		return vehicleList;
	}
	
	private List<Vehicle> returnEmptyList() {
		return vehicleList;
	}
	

}
