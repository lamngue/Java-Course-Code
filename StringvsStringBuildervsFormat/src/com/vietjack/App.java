package com.vietjack;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String info = "";
		info += "Toi ";
		info += "ten ";
		info += "la ";
		info += "Lam";
		System.out.println(info); // tao 5 doi tuong
		StringBuilder sb = new StringBuilder("");
		sb.append("Toi ");
		sb.append("ten ");
		sb.append("la ");
		sb.append("Lam ");
		System.out.println(sb.toString()); // tao 1 doi tuong
		StringBuilder sb2 = new StringBuilder().append("Toi").append(" Ten ").append("la ").append("Lam");
		System.out.println(sb2.toString()); 
		System.out.println("Hom nay la \t thu 6 ngay \n 2 thang 6\" \\ \'");
		for(int i = 0;i<20;i++) {
			System.out.printf("%2d text\n", i);
		}
		double number = 1.234567;
		String value = String.format("3 so sau dau phay: %1.3f", number);
		System.out.println(value);
	}

}
