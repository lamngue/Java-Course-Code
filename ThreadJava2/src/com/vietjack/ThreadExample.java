package com.vietjack;

public class ThreadExample {
	public int count = 0;
	public synchronized void increment() {
		count++;
	}
	public void doWork() {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i = 0;i<10000;i++) {
					increment();
				}
			}	
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i = 0;i<10000;i++) {
					increment();
				}
			}	
		});
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Count is: "+count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadExample example = new ThreadExample();
		example.doWork();
	}

}
