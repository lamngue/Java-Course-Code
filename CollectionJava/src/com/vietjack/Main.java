package com.vietjack;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String []args) {
		Cinema cinema = new Cinema("CGV",8,12);
		cinema.printCinemaSeats();
		if(cinema.reserveSeat("A03")) {
			System.out.println("Tra tien cho viec dat ghe");
		}else {
			System.out.println("Ghe da duoc dat");
		}
		if(cinema.reserveSeat("A04")) {
			System.out.println("Tra tien cho viec dat ghe");
		}else {
			System.out.println("Ghe da duoc dat");
		}
	}

}
