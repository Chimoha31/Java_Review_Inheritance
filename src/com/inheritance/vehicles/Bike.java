package com.inheritance.vehicles;
import com.inheritance.parent.Vehicle;

public class Bike extends Vehicle{
	
	private String handle;
	
	public Bike() {
		super();
		this.handle = "short";
	}

	public Bike(String handle, String engine, int wheels, int seats, int feulTank, String lights) {
		super(engine, wheels, seats, feulTank, lights);
		this.handle = handle;
	}

	public String getHandle() {
		return handle;
	}

	@Override
	public String run() {
		return "Varoom";
	}
	
}
