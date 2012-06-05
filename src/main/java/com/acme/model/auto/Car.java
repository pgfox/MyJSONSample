package com.acme.model.auto;

public class Car {
	
	private String model;
	private Engine engine;
	private FuelTank fuelTank;

	public synchronized String getModel() {
		return model;
	}
	public synchronized void setModel(String model) {
		this.model = model;
	}
		
	public synchronized Engine getEngine() {
		return engine;
	}
	public synchronized void setEngine(Engine engine) {
		this.engine = engine;
	}
	public synchronized FuelTank getFuelTank() {
		return fuelTank;
	}
	public synchronized void setFuelTank(FuelTank fuelTank) {
		this.fuelTank = fuelTank;
	}
	
	

}
