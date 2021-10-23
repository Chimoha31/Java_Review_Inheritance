package com.m0921;

public class Main {

	public static void main(String[] args) {
//		mainでインスタンスを作る。mainではないところでは実態は作れない。
		Car car = new Car("closed", "on", "seated", 20);
		
//		car.setDoors("closed");
//		car.setEngine("on");
//		car.setDriver("seated");
//		car.setSpeed(5);
//		
//		System.out.println(car.run());
//		System.out.println(car.getSpeed());
//		System.out.println(car.getDriver());
//		System.out.println(car.getEngine());
		System.out.println(car.getDoors());
		
		System.out.println(car.run());
		
	}

}
