package com.exercise.task4;

public class Oddeven {
	
	public void oddOrEven(int a) {
		if(a%2==0) {
			System.out.println("Even");
		}
		else 
			odd();
		
			
	}
	
	public void odd() {
		System.out.println("odd");
	}

	public static void main(String[] args) {
		
		Oddeven number = new Oddeven();
		
		number.oddOrEven(5);
		

	}

}
