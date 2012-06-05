package com.acme.model.auto;

public class Engine {
	
	private String model;
	private String maker;
	
	public synchronized String getModel() {
		return model;
	}
	public synchronized void setModel(String model) {
		this.model = model;
	}
	public synchronized String getMaker() {
		return maker;
	}
	public synchronized void setMaker(String maker) {
		this.maker = maker;
	}
	
}
