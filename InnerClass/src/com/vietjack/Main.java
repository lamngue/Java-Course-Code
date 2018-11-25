package com.vietjack;

import com.vietjack.Robot.Brain;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot robot = new Robot(7);
		robot.start();
		//Goi innerclass
		Brain brain = robot.new Brain(); // hoacla Robot.brain brain = robot.new Brain()
		brain.think();
		Robot.Battery battery = new Robot.Battery();
		battery.charge();
	}

}
