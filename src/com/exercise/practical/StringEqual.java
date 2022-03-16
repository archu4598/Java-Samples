package com.exercise.practical;
public class StringEqual {
	String str2;
	public boolean equals(StringEqual obj1) {
		return true;
	}
	public static void main(String[] args) {
		StringEqual obj1 = new StringEqual();
		StringEqual obj = new StringEqual();
		obj.str2 = "Archu";
		obj1.str2 = "Archu";
		if(obj==obj1)
			System.out.println("Equal1");
		else
			System.out.println("Not Equal1");
		
		if(obj.equals(obj1))  //object oda equals address check pannum
			System.out.println("Equal2");
		else
			System.out.println("Not Equal2");
		
		if((obj.str2).equals(obj1.str2))
			System.out.println("Equal3");
		else
			System.out.println("Not Equal3");
		
		
		String str = "Archu";
		String str3 = "Archu";
		obj.str2 = "Archu";
		if(str==str3)  //string la .equal will check the value
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
	}
}
