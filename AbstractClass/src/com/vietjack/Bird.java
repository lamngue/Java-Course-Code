package com.vietjack;

public abstract class Bird extends Animal {

	public Bird(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(getName() + " is mo thuc an-ing");
	}

	@Override
	public void breathe() {
		// TODO Auto-generated method stub
		System.out.println(getName() + "is tho-ing");
	}
	public abstract void fly();
}
