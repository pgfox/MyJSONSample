package com.acme.model.auto;

public class CarFactory {
	
	static public Car createCar(){
		Car car = new Car();
		car.setModel("Toyota");
		Engine engine= new Engine();
		engine.setMaker("Jaguar");
		engine.setModel("v12");
		
		FuelTank fuelTank = new FuelTank();
		fuelTank.setCurrentLevel(30);
		
		car.setEngine(engine);
		car.setFuelTank(fuelTank);
		return car;
	}

}
