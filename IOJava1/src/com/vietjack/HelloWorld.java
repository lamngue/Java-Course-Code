package com.vietjack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "\\";
		System.out.println(a);
		String b = "\"";
		System.out.println(a);
		String fileName ="test.txt";
		File file = new File(fileName);
		try {
			Scanner scanner = new Scanner(file);
			int number = scanner.nextInt();
			System.out.println("The number is " + number);
			scanner.nextLine();
			while(scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
