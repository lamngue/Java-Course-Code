package com.vietjack;

public class Robot {
	private long id;
	public Robot(long id) {
		// TODO Auto-generated constructor stub
		this.id = id;
	}
	//innerclass cua robot
	class Brain{
		public void think() {
			System.out.println("Robot is thinking");
		}
	}
	//ko can tao instance
	static class Battery{
		public void charge() {
			System.out.println("Robot is charging");
		}
	}
	public void start() {
		System.out.println("Robot with id= " + this.id +" is starting");
		Brain brain = new Brain();
		brain.think();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
