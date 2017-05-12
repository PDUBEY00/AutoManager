package com.accenture.auto.common;

import java.util.HashMap;
import java.util.List;

import com.accenture.auto.model.base.Vehicle;

public interface JSONReader {
	public HashMap<String, List<Vehicle>> readFile();
}
