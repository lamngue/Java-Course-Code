package com.vietjack.utils;

public class MathUtils {

	public MathUtils() {
		// TODO Auto-generated constructor stub
	}
	public static int sum(int n) {
		return n*(n+1)/2;
	}
	public static int factorial(int n) {
		if(n == 1 || n ==0) {
			return n;
		}
		else {
			return factorial(n-1)*n;
		}
	}
	public static int fibonacci(int n) {
		if(n ==1 || n == 2) {
			return 1;
		}
		else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
}
