package com.vietjack;

public class Main {
	public Main() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Machine machine1 = new Machine();
		machine1.start();
		Manager manager1 = new Manager("Lam");
		manager1.work();
		//Runable, Comparable, Comparator
		machine1.showInfo();
		manager1.showInfo();
		System.out.println("-------------");
		Info info2 = new Machine();
		//info2.showInfo();
		Info info3 = new Manager("Ken");
		//info3.showInfo();*/
		System.out.println("-------------");
		showDetailInfo(info2);
		showDetailInfo(info3);
	}
	public static void showDetailInfo(Info info) {
		info.showInfo();
	}
}
