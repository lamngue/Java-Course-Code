package com.vietjack;

public class Manager implements Info {
	private String name;
	public Manager(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	public void work() {
		System.out.println("Manager starts working:");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("Manager with name:" + name);
		System.out.println("Manager hoc truong:" + university);
	}

}
