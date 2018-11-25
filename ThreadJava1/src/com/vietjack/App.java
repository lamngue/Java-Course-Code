package com.vietjack;
//xu ly du lieu da luong
class Runner extends Thread{ //viet lai method run neu extends Thread
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Hello World: " + i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runner runner1 = new Runner();
		runner1.start();
		Runner runner2 = new Runner();
		runner2.start();
	}

}
