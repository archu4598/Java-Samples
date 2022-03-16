package com.exercise.stat;

public class Nochange {
	
	public int count1=0;
	public static int count2=0;  // static var and static methods can be accessed only thru the class name
	//static int count2++;
	public static void display() {
	
		System.out.println(count2++);
	}
	
	public void display2() {
		System.out.println(count1++);
	}
	
	public static void main(String[] args) {
		
		Nochange chn = new Nochange();
		Nochange chn1 = new Nochange();
		Nochange.display(); 
		chn.display2(); //0
		Nochange.display(); 
		chn1.display2();
		Nochange.display(); 
		chn.display2(); //1
	}
}
