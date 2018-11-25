package com.vietjack;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class HelloWorld {
	void m() throws FileNotFoundException /*khai bao exception*/ {
		//uncheck exception
		//checked exception (loi compile time)
		//FileReader fr = new FileReader("test.txt");
		throw new FileNotFoundException(); // chu dong tao ra exception
	}
	void n() throws FileNotFoundException {
		m();
	}
	void p() throws FileNotFoundException {
		n();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld hello = new HelloWorld();
		try {
			hello.p();
			System.out.println("Chay bt");
		}catch(FileNotFoundException e){
			System.out.println("File ko thay");
		}
	}

}
