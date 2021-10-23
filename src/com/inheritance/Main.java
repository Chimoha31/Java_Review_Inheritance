package com.inheritance;
import com.inheritance.vehicles.Bike;
import com.inheritance.parent.Vehicle;


public class Main {

	public static void main(String[] args) {
		
		Bike bike = new Bike("long", "Dessel", 2, 1, 10, "LED" );
		Vehicle vehicle = new Vehicle("long", 2, 1, 10, "LED");
//		Bike bike2 = new Bike();
//		bike.handle = "short";
		
		System.out.println(bike.getHandle());
//		System.out.println(bike2.getHandle());
		System.out.println(bike.lights);
		System.out.println(bike.run());
		System.out.println(vehicle.run());
		

	}

}
