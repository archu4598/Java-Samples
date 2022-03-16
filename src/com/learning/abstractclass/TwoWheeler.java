package com.learning.abstractclass;

public class TwoWheeler extends Vehicle{

	@Override
	public void typeOfVehicle() {
		// TODO Auto-generated method stub
		System.out.println("I am two wheeler");
	}
         
	
	public static void main(String[] args) {
		TwoWheeler RE = new TwoWheeler();
		RE.typeOfVehicle();
		RE.running();
	}
}
