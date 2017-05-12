package com.accenture.auto.common.impl;

import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.accenture.auto.common.JSONReader;
import com.accenture.auto.model.Bike;
import com.accenture.auto.model.base.Vehicle;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSONReaderImpl implements JSONReader {

	@Override
	public HashMap<String, List<Vehicle>> readFile() {
		
		Calendar currentDat = Calendar.getInstance();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		String dateString = dateFormat.format(currentDat.getTime());
		
	
		try { System.out.println("Reading JSON file from Java program"); 
		FileReader fileReader = new FileReader(".//JSON//"+dateString+".json"); 
		
		JSONParser parser = new JSONParser();
		JSONObject json = (JSONObject) parser.parse(fileReader);
		
		JSONArray characters = (JSONArray) json.get("Bike"); 
		Iterator i = characters.iterator();
		System.out.println("Bikes: "); 
		List<Vehicle> bikeList =new ArrayList<>();
		while (i.hasNext()) 
		{ 
			
			JSONObject slide = (JSONObject) i.next();
			String title = (String)slide.get("title");
			
			Vehicle bike=new Bike((String)slide.get("color"),Double.parseDouble((String)slide.get("fuelType")),(String)slide.get("price"), Integer.parseInt((String)slide.get("engineSize")));
			System.out.println(" " + i.next()); } }
		    catch (Exception ex) { ex.printStackTrace(); 
		
		}
		

	
	return "done";
		

}
}