package com.m0921;

public class Main {

	public static void main(String[] args) {
//		mainでインスタンスを作る。mainではないところでは実態は作れない。
		Car car = new Car();
		
		car.setDoors("closed");
		car.setEngine("on");
		car.setDriver("Chiho");
		car.setSpeed(5);
		System.out.println(car.getSpeed());
		System.out.println(car.run());
	}

}
