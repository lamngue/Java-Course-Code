package com.vietjack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "out.bin";
		try {
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fileName));
			os.writeInt(2044);
			os.writeDouble(3.1415);
			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Hoan thanh viec ghi");
		try {
			ObjectInputStream is = new ObjectInputStream(new FileInputStream(fileName));
			int i = is.readInt();
			System.out.println(i);
			double d = is.readDouble();
			System.out.println(d);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Hoan thanh viec doc");
	}

}
