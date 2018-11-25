package com.vietjack;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}
	//bien global
	static int x;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(x);
		x=5;
		System.out.println(x);
		doSomething();
		System.out.println(x);
		doSomethingLocal();
	}
	public static void doSomething() {
		x =10;
	}
	public static void doSomethingLocal() {
		//bien local
		System.out.println("Chay ham local");
		int y = 12;
		System.out.println(x);
		int x = 11;
		System.out.println(x);
	}
}
