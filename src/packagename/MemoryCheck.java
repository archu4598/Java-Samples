package packagename;

public class MemoryCheck {
	public String test;
	public boolean equals(MemoryCheck obj) {
		return this.test == obj.test ? true : false;
	}

	public static void main(String[] args) {
		MemoryCheck obj3 = new MemoryCheck();
		MemoryCheck obj4 = new MemoryCheck();
		
		obj3.test = "1";
		obj4.test = "1";
		
		if(obj3.equals(obj4)) {
			System.out.println("eq"); //by default, equals checks the address of the value
		}
		else {
			System.out.println("neq");
		}
		//Object obj = new MemoryCheck();
		//MemoryCheck obj1 = (MemoryCheck) obj; 
		//generic type casting
		MemoryCheck mc = new MemoryCheck();
		mc.test = "1";
		MemoryCheck mc1 = new MemoryCheck();
		mc1.test="1";
		
		if(mc==mc1) {
			System.out.println("Equal");
		}
		else
			System.out.println("Not Equal");
		
		MemoryCheck mc2 = new MemoryCheck();
		mc2.test = "1";
		MemoryCheck mc3 = mc2;
		mc3.test="1";
		
		if(mc2.equals(mc3)) {  //checks the value
			System.out.println("Equal");
		}
		else
			System.out.println("Not Equal");
		
		String str1 = "Archana";
		String str2 = "Archana";

		if (str1 == str2) {
			System.out.println("Equal");
		} else
			System.out.println("Not equal");
		
		String str3 = new String("Archana");
		String str4 = new String("Archana");
		
		if(str3==str4)
		{
			System.out.println("Equal");
		}
		else
			System.out.println("Not equal");
	}

}
