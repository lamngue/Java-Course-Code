package com.vietjack;

import java.util.HashMap;
import java.util.Map;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> studentMap = new HashMap<Integer,String>();
		studentMap.put(1, "Hoa");
		studentMap.put(2, "Hoa");
		studentMap.put(3, "Man");
		studentMap.put(4, "Dao");
		studentMap.put(5, "Quat");
		System.out.println(studentMap);
		for(Map.Entry<Integer, String> entry: studentMap.entrySet()) {
			System.out.println(entry.getKey() + "------" + entry.getValue());
		}
		// thay the key, key is unique
		if(studentMap.containsKey(3)) {
			System.out.println("Da co phan tu 3");
		}else {
			studentMap.put(3, "Hong");
		}
		System.out.println("-------");
		for(Map.Entry<Integer, String> entry: studentMap.entrySet()) {
			System.out.println(entry.getKey() + "------" + entry.getValue());
		}
		//xoa phan tu
		studentMap.remove(2);
		System.out.println("-------");
		System.out.println(studentMap);
	}

}
