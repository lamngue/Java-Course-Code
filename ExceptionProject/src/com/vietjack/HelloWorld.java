package com.vietjack;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao so dau tien");
		int n1 = scanner.nextInt();
		System.out.println("Nhap vao so thu hai");
		int n2 = scanner.nextInt();
		try {
			int divide = n1/n2;
			System.out.println("Ket qua: "+ divide);
		}catch(ArithmeticException e) { //bat loi dai so
			e.printStackTrace();
			System.out.println("Chuong trinh loi");
		}finally { // du chuong trinh co loi hay ko thi van thuc hien
			System.out.println("Chuong trinh ket thuc");
		}
		System.out.println();
	}

}
