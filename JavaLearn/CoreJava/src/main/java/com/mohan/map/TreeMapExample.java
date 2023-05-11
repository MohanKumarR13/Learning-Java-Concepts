package com.mohan.map;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<String, String>placeErode=new TreeMap<String,String>();
		placeErode.put("Sivagiri", "Erode");
		placeErode.put("Bhavani", "Erode");
		placeErode.put("Arachalur", "Erode");
		placeErode.put("Pasur", "Erode");
		placeErode.put("Kodumudi", "Erode");
		
		placeErode.put("AmmanKovil", "Erode");
		placeErode.put("AmmanKovil", "Kodumudi");
		//placeErode.put(null, "Erode");
		placeErode.put("AmmanKovil", "Erode");

		System.out.println(placeErode);




	}

}
