package com.accenture.auto.service.impl;

import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import com.accenture.auto.model.base.Vehicle;
import com.accenture.auto.service.Service;

public class JSONServiceImplTest {
Service service = new JSONServiceImpl();
  @Test
  public void getVehicleDetails() {
	HashMap<String, List<Vehicle>> jsonres = service.getVehicleDetails();
   // throw new RuntimeException("Test not implemented");
  }

  @Test
  public void saveVehicleDetails() {
	  service.saveVehicleDetails(null);
   // throw new RuntimeException("Test not implemented");
  }
}
