package com.vietjack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> animals  = new ArrayList<String>();
		animals.add("dog");
		animals.add("cat");
		animals.add("ant");
		animals.add("rabbit");
		Iterator<String> it = animals.iterator(); //co the vua duyet vua xoa phan tu
		while(it.hasNext()) {
			String animal = it.next(); //in tu phan tu 0 neu chua goi bao h
			System.out.println(animal);
			if(animal.equals("cat")) {
				it.remove(); // gap "cat" thi remove phan tu
			}
		}
		System.out.println("---------------");
		for(String animal:animals) {
			System.out.println(animal);
		}
	}

}
