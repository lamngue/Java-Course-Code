package com.vietjack;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String []args) {
		Animal dog1 = new Dog("Pitbull");
		dog1.eat();
		dog1.breathe();
		Bird bird = new Parrot("Parrot");
		bird.eat();
		bird.breathe();
		bird.fly();
	}
}
