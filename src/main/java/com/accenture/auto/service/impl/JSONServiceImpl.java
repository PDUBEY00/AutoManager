package com.accenture.auto.service.impl;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import com.accenture.auto.common.JSONReader;
import com.accenture.auto.common.JSONWriter;
import com.accenture.auto.model.base.Vehicle;
import com.accenture.auto.service.Service;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONServiceImpl implements Service{
	private JSONWriter writer;
	private JSONReader reader;

	@Override
	public HashMap<String, List<Vehicle>> getVehicleDetails() {
		return null;
	}

	@Override
	public void saveVehicleDetails(HashMap<String, List<Vehicle>> vehicleDetails) {
		ObjectMapper mapper = new ObjectMapper();
		String jsonString = null;
		try {
			jsonString = mapper.writeValueAsString(vehicleDetails);
			writer.writeFile(jsonString);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public JSONWriter getWriter() {
		return writer;
	}

	public void setWriter(JSONWriter writer) {
		this.writer = writer;
	}

	public JSONReader getReader() {
		return reader;
	}

	public void setReader(JSONReader reader) {
		this.reader = reader;
	}
}
