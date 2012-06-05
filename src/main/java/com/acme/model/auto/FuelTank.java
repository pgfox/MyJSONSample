package com.acme.model.auto;

public class FuelTank {
	enum FuelType  {DIESEL,PETROL};
	
	private final int capacity = 100;
	private final FuelType  fuelType = FuelType.DIESEL;
	private int currentLevel;
	
	public synchronized int getCurrentLevel() {
		return currentLevel;
	}
	public synchronized void setCurrentLevel(int currentLevel) {
		this.currentLevel = currentLevel;
	}
	public synchronized int getCapacity() {
		return capacity;
	}
	public synchronized FuelType getFuelType() {
		return fuelType;
	}
	
	
}
