package com.vietjack;

import java.util.ArrayList;

public class Cinema {
	private String cinemaName;
	private ArrayList<Seat> seats = new ArrayList<Seat>();
	public Cinema(String cinemaName,int numRow, int seatPerRow) {
		// TODO Auto-generated constructor stub
		this.cinemaName = cinemaName;
		int lastRow = 'A' + numRow -1;
		for(char row='A';row<=lastRow;row++) {
			for(int seatNum=1;seatNum<=seatPerRow;seatNum++) {
				Seat seat = new Seat(row+String.format("%02d", seatNum));
				seats.add(seat);
			}
		}
		
	}
	public boolean reserveSeat(String seatNumber) {
		Seat requestSeat = null;
		for(Seat seat:seats) {
			if(seat.getSeatNumber().equals(seatNumber)) {
				requestSeat = seat;
				break;
			}
		}
		if(requestSeat == null) {
			System.out.println("Ghe ban dat ko ton tai");
			return false;
		}
		return requestSeat.reserve();
	}
	public void printCinemaSeats() {
		for(Seat seat:seats) {
			System.out.println(seat.getSeatNumber());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
