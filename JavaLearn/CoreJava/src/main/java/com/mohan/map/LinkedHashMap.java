package com.mohan.map;

import java.util.HashMap;

public class LinkedHashMap {

	public static void main(String[] args) {
		java.util.LinkedHashMap<String, String> heros = new java.util.LinkedHashMap<String, String>();
		heros.put("Bat Man", "Bruce Wayne");
		heros.put("Super Man", "Clark Kent");
		heros.put("Flash", "Barry Allen");
		heros.put(null, "Diana");
		heros.put(null, "Mera");
		heros.put(null, null);
		System.out.println(heros);

		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("Bat Man", "Bruce Wayne");
		hashMap.put("Super Man", "Clark Kent");
		hashMap.put("Flash", "Barry Alan");
		hashMap.put(null, "Diana");
		hashMap.put(null, "Mera");

		System.out.println(hashMap);
	}

}
