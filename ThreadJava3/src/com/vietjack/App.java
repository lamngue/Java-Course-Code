package com.vietjack;
//wait
//notify
//notifyAll
class Customer{
	int amount = 1000;
	synchronized void withdraw(int amount) {
		System.out.println("Chuan bi rut tien");
		if(this.amount<amount) {
			System.out.println("ko du tien,doi nap them");
		}
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.amount -= amount;
		System.out.println("Rut tien thanh cong");
	}
	synchronized void deposit(int amount) {
		System.out.println("Chuan bi nap tien");
		this.amount += amount;
		System.out.println("Nap thanh cong");
		notify(); //danh thuc object dang trong trang thai wait
	}
}
public class App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Customer c = new Customer();
		new Thread () {
			public void run(){
				c.withdraw(5000);
			}
		}.start();
		new Thread () {
			public void run(){
				c.deposit(10000);
			}
		}.start();
	}

}
