package com.vietjack;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String message = "";
		try {
			int a[] = new int[5];
			System.out.println("Nhap vao 1 so");
			int divide = scanner.nextInt();
			int result = a[5]/divide;
		//multiple catches
		}catch(InputMismatchException e) {
			message = "Loi nhap ko phai so";
		}catch(ArithmeticException e) {
			message = "Loi chia cho 0";
		}catch(ArrayIndexOutOfBoundsException e) {
			message = "Loi out of bound";
		}
		System.out.println("Message: " +message);
	}

}
