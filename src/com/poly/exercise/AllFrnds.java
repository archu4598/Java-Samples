package com.poly.exercise;

public class AllFrnds{

	public static void main(String[] args) {
		
     String name = "Anu";
     Friends obj = null;
     if(name.equals("Pavi")){
    	 obj = new Pavi();
     }
     else if(name.equals("Anu")){
    	 obj = new Shri();
     }
     else{
    	 obj = new Aswanth();
     }
	
     obj.myCategory();
     obj.years();
	}
}
