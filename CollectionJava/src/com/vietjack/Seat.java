package com.vietjack;

public class Seat {
	private String seatNumber;
	private boolean reserved;
	public boolean reserve() {
		if(!this.reserved) {
			this.reserved = true;
			System.out.println("Ghe: " + seatNumber+ " da dc dat");
			return true;
		}
		else
			return false;
	}
	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}


	public Seat(String seatNumber) {
		// TODO Auto-generated constructor stub
		this.reserved=false;
		this.seatNumber=seatNumber;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
