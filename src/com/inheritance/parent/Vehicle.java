package com.inheritance.parent;

public class Vehicle {
	
	public String engine;
	public int wheels;
	public int seats;
	public int fuelTank;
	public String lights;
	
	
//	default constructor(= without parameter)
	public Vehicle() {
		this.engine = "petrol";
		this.wheels = 4;
		this.seats = 4;
		this.fuelTank = 35;
		this.lights = "LED";
	}

//	constructor(= with parameter)
//	右クリック⇨source⇨create constructor using fieldで自動に作れる
	public Vehicle(String engine, int wheels, int seats, int fuelTank, String lights) {
//		super();
		this.engine = engine;
		this.wheels = wheels;
		this.seats = seats;
		this.fuelTank = fuelTank;
		this.lights = lights;
	}
	

}
