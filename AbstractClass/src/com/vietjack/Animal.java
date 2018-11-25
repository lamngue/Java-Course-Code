package com.vietjack;

public abstract class Animal {
	private String name;
	public Animal(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	public abstract void eat();
	public abstract void breathe();
	public String getName() {
		return this.name;
	}
}
