package com.vietjack;

public class Dog extends Animal {

	public Dog(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(getName() + " is eating");
	}

	@Override
	public void breathe() {
		// TODO Auto-generated method stub
		System.out.println(getName() + "is breathing");
	}

}
