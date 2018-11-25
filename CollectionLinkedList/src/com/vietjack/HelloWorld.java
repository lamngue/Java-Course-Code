package com.vietjack;

import java.util.ArrayList;
import java.util.LinkedList;

public class HelloWorld {

	public HelloWorld() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String []args) {
		/*LinkedList<String> name = new LinkedList<String>();
		name.add("hoa");
		name.add("hong");
		name.add("dao");
		name.addFirst("hue");
		name.add(1,"cuong");
		for(String element:name) {
			System.out.println(element);
		}*/
		//insert nhanh hon arraylist, search cham hon arrayList
		long n = (long)1E7;
		LinkedList linkedList = new LinkedList();
		long milisecond = System.currentTimeMillis();
		for(int i = 0;i<n;i++) {
			linkedList.add(i);
		}
		ArrayList arrayList = new ArrayList();
		long milisecond1 = System.currentTimeMillis();
		for(int i = 0;i<n;i++) {
			arrayList.add(i);
		}
		System.out.println("Insert with linked list takes: "+ (System.currentTimeMillis()-milisecond));
		System.out.println("Insert with array list takes: "+ (System.currentTimeMillis()-milisecond1));
	}
}
