package com.vietjack;

public class HelloWorld {
	static void validate(int age) throws InvalidAgeException {
		if(age<18) {
			throw new InvalidAgeException("em chua 18, moi co: " + age);
		}else {
			System.out.println("Welcome");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			validate(19);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Ctrinh ket thuc");
	}

}
