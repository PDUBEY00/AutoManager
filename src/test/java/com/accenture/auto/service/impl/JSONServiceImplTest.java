package com.accenture.auto.service.impl;

import org.testng.annotations.Test;

import com.accenture.auto.common.impl.JSONReaderImpl;
import com.accenture.auto.common.impl.JSONWriterImpl;
import com.accenture.auto.service.Service;

public class JSONServiceImplTest {
Service service = new JSONServiceImpl(new JSONWriterImpl(), new JSONReaderImpl());
  @Test
  public void getVehicleDetails() {
	  service.getVehicleDetails();
    //throw new RuntimeException("Test not implemented");
  }

  @Test
  public void saveVehicleDetails() {
    throw new RuntimeException("Test not implemented");
  }
}
