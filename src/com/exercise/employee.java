package com.exercise;

public class employee {
	public int id,age;
	public String empName, Designation;

	public static void main(String[] args) {
		employee emp = new employee();
		emp.id = 1;
		emp.age = 23;
		emp.empName = "Archu";
		emp.Designation= "Software Engineer";	
		
		param.getHere(emp);
		System.out.println(emp.age);
		param.updateParam(emp);
		System.out.println(emp.age);
		System.out.println(emp.id);
		param.updateID(emp.id);
		System.out.println(emp.id);
	}
}

class param{
	
	public static void getHere(employee d) {
		System.out.println(d.id);
		System.out.println(d.age);
		System.out.println(d.empName);
		System.out.println(d.Designation);
	}
	public static void updateParam(employee e)
	{
		e.age = e.age+1;
	}
	public static void updateID(int a) {
		a = a+1;
	}
}

