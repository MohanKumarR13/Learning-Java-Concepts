package com.mohan.collection_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample {
	public void arrayListExample() {
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("BMW");
		arrayList.add("Benz");
		arrayList.add("Bugatti");
		arrayList.add("Bently");
		System.out.println(arrayList);
		System.out.println(arrayList.get(0));
		System.out.println(arrayList.indexOf("Bugatti"));
		System.out.println(arrayList.lastIndexOf("Bently"));

		List<String> anotherList = new ArrayList<String>();
		anotherList.addAll(arrayList);
		System.out.println(anotherList);
		anotherList.clear();
		System.out.println(anotherList);
		arrayList.remove(0);
		System.out.println(arrayList);
		arrayList.remove("Benz");
		System.out.println(arrayList);
		arrayList.add(null);
		System.out.println(arrayList);
		arrayList.set(0, "TATA");
		System.out.println(arrayList);
		System.out.println(arrayList.isEmpty());
		// Iteratable
		for (String string : arrayList) {
			System.out.println("Using For Each" + string);
		}
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println("Using Normal For Loop" + arrayList.get(i));
		}
		System.out.println("***************************");
		ListIterator<String> list_iterator = arrayList.listIterator();
		while (list_iterator.hasNext()) {
			System.out.println(list_iterator.next());
		}
		while (list_iterator.hasPrevious()) {
			System.out.println(list_iterator.previous());
		}
		System.out.println("***************************");
		Iterator<String> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

	public static void main(String[] args) {
		ArrayListExample arrayListExample = new ArrayListExample();
		arrayListExample.arrayListExample();

	}

}
