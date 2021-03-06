package com.vietjack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
abstract class Shape{
	abstract void draw();
}
class Rectangle extends Shape{
	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Ve chu nhat");
	}
}
class Circle extends Shape{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Ve hinh tron");
	}
	
}
public class HelloWorld {

	public HelloWorld() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// before Java 1.5
/*		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(7);
		printDouble(list);*/
		// Starting fr Java 1.5
		/*ArrayList <Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(5);
		list2.add(7);
		printDouble(list2);
		HashMap <String,Integer> hashmap = new HashMap<String,Integer>();*/
		/*Integer [] intArray = {10,20,30,40,50,60};
		Character [] charArray = {'A','C','B','K','G'};
		System.out.println("In ra mang int");
		printArray(intArray);
		System.out.println("In ra mang char");
		printArray(charArray);*/
		List <Rectangle> list1 = new ArrayList<Rectangle>();
		list1.add(new Rectangle());
		drawShape(list1);
		List <Circle> list2 = new ArrayList<Circle>();
		list2.add(new Circle());
		list2.add(new Circle());
		drawShape(list2);
	}
	public static <T> void printArray(T[] array) {
		for(T element:array) {
			System.out.println(element);
		}
	}
	public static void printDouble(ArrayList<Integer> list) {
		for(int i:list) {
			System.out.println(i*2);
		}
	}
	public static void drawShape(List<? extends Shape> list) {
		for(Shape s:list) {
			s.draw();
		}
	}
}
