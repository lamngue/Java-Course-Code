package com.vietjack;

public class Main {
	String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount lam = new BankAccount("Lam");
		lam.deposit(50);
		lam.deposit(20);
		lam.withdrawn(100);
		lam.withdrawn(60);
	}

}
