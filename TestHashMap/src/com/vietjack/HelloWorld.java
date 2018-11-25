package com.vietjack;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashMap
		//LinkedHashMap
		//TreeMap
		//HashTable
		Map <Integer,String> hashMap = new HashMap<Integer,String>();
		Map <Integer,String> linkedhashMap = new LinkedHashMap<Integer,String>();
		Map <Integer,String> treeMap = new TreeMap<Integer,String>();
		Map <Integer,String> hashTable = new Hashtable<Integer,String>();
		//hashMap in thu tu ngau nhien, linked in thu tu put, treeMap sap xep theo id
		testMain(treeMap);
	}
	public static void testMain(Map<Integer,String> testMap) {
		testMap.put(11, "Ha");
		testMap.put(5, "An");
		testMap.put(6, "Hoa");
		testMap.put(7, "Binh");
		testMap.put(12, "The");
		testMap.put(9, "Gioi");
		testMap.put(22, "My");
		testMap.put(30, "Viet");
		testMap.put(45, "Nam");
		for(Integer key:testMap.keySet()) {
			String value = testMap.get(key);
			System.out.println(key + "-------" + value);
		}
	}

}
