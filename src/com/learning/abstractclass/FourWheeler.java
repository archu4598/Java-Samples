package com.learning.abstractclass;

public class FourWheeler extends Vehicle{

	@Override
	public void typeOfVehicle() {
		// TODO Auto-generated method stub
		System.out.println("I am four wheeler");
	}
	public void running() {
		System.out.println("I am flying");
	}

	
	public static void main(String[] args) {
		FourWheeler car = new FourWheeler();
		car.typeOfVehicle();
		car.running();
	}
}
