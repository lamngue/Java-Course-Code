package com.vietjack;

public class BankAccount {
	private String name;
	private double balance = 0.0d;
	public BankAccount(String name) {
		this.name = name;
	}
	public double getBalance() {
		return this.balance;
	}
	public void deposit(double amount) {
		this.balance += amount;
		System.out.println("Ban vua nap so tien:" +amount);
		System.out.println("So du hien tai la:" + this.balance);
	}
	/*public void setBalance(double balance) {
		this.balance = balance;
	}*/
	public void withdrawn(double amount) {
		if(this.balance<amount) {
			System.out.println("Deo rut dc dmm"+amount);
			System.out.println("Ban chi rut dc toi da:"+this.balance);
		}else {
			this.balance -= amount;
			System.out.println("Ban vua rut so tien:" +amount);
			System.out.println("So du hien tai la:" + this.balance);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
