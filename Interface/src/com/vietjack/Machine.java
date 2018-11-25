package com.vietjack;

public class Machine implements Info {
	private long id;
	public Machine() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("Machine with id:" + id);
	}
	public void start() {
		System.out.println("Machine is starting");
	}

}
