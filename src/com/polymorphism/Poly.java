package com.polymorphism;

public class Poly {

	
	public static void main(String[] args) {
		String type = "Cat";
		Animal obj = null;
		if(type.equals("Dog")) {
			obj = new Dog();
		}
		else {
			obj = new Cat();
		}
		
		
		obj.printAnimalSound();
	}
}
