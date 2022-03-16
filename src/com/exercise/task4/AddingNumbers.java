package com.exercise.task4;

public class AddingNumbers {
	public int a = 123457;
	public int sum=0, sum1=0;
	
	public void add() {
		while(a!=0) {  //how to write in for
		    sum1 = a%10;
		    sum = sum+sum1;
		    a = a/10;
			}
		System.out.println(sum);
		//System.out.println(sum1 + " " + a);
	}

	public static void main(String[] args) {
		
		AddingNumbers number = new AddingNumbers();
		
		number.add();		
		
		
		
		
		

	}

}
