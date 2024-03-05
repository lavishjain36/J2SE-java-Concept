package com.relationship;

public class Car {
	String model;
    Engine engine;//Car has an engine
    Car(String model, Engine engine) {
		this.model=model;
		this.engine=engine;
	}
	
	 public void startcar() {
		 System.out.println(model+ " started...");
		 engine.start();
	 }

}
