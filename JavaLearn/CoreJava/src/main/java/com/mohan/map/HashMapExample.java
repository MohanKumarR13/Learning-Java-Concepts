package com.mohan.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		// To insert an element PUT method is used
		HashMap<Integer, String> employeeMap = new HashMap<>();
		employeeMap.put(1, "Ben");
		employeeMap.put(2, "Gwen");
		employeeMap.put(1, "Kevin");
		employeeMap.put(1, "Max");
		employeeMap.put(1, "Yashmith");
		System.out.println("Employee Map :" + employeeMap);
		// To make the copy of existing map
		Map<Integer, String> duplicateMap = new HashMap<>();
		duplicateMap.putAll(employeeMap);
		System.out.println("Duplicate Map :" + duplicateMap);
		// Clear to delete map contents
		duplicateMap.clear();
		System.out.println("Afer Clear the Map" + duplicateMap);
		// To check the if key is present or not
		System.out.println("Does this map has Key 1?" + employeeMap.containsKey(1));
		// To check the if value is present or not
		System.out.println("Does this map has Value Kevin?" + employeeMap.containsValue("Kevin"));
		// Clone Map
		System.out.println("Clone Map :" + employeeMap.clone());
		// Check if map is empty or not
		System.out.println("Is Empty ? " + employeeMap.isEmpty());
		// Fetch the set of keySet
		System.out.println("Key Set" + employeeMap.keySet());
		// Fetch the values
		System.out.println(employeeMap.get(1));
		// Fetch the all of values
		System.out.println("All Set" + employeeMap.values());
		// Entry Set
		System.out.println("Entry  set" + employeeMap.entrySet());

	}

}
