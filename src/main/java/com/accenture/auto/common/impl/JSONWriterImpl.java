package com.accenture.auto.common.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.accenture.auto.common.JSONWriter;

public class JSONWriterImpl implements JSONWriter{

	@Override
	public void writeFile(String content) {
		try {
			Calendar currentDat = Calendar.getInstance();
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
			String dateString = dateFormat.format(currentDat.getTime());
			FileWriter file = new FileWriter(".//JSON//"+dateString+".json");
			file.write(content);
			file.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
