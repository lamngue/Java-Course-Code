package com.vietjack;
import java.util.*;

import com.vietjack.utils.MathUtils;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//java.lang.*
		System.out.println("Tong tu 1 den 10:" + MathUtils.sum(10));
		System.out.println("Giai thua cua 10:" + MathUtils.factorial(10));
		System.out.println("10 so fibonacci dau tien");
		for(int i = 1;i<=10;i++) {
			System.out.println(MathUtils.fibonacci(i));
		}
	}

}
