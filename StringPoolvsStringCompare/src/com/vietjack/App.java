package com.vietjack;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Bello");
		String s2 = new String("Hello"); //khac vung nho
		System.out.println(s1.compareTo(s2));
		System.out.println(s1==s2);
		/*if(s1.compareTo(s2)) { //so sanh theo vung nho, su dung equals de so sanh gia tri
			System.out.println("s1 == s2");
		}else {
			System.out.println("s1 != s2");
		}*/
		String s3 = "Hello"; //tao vung nho, day doi tuong vao stringPool
		String s4 = "Hello";
		if(s3==s4) {
			System.out.println("s3==s4");
		}else {
			System.out.println("s3!=s4");
		}
	}

}
