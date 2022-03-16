package Methover;

public class empCons {
	public String empName;
	public Integer empID;
	
	public empCons(String empName, int empID) {
	   this.empID= empID;
	   this.empName = empName;
	}
	public empCons() {
		empName = null;
		empID = null; //if its int, then have to pass 0
	}
	
	
	public static void main(String[] args) {
		
	    empCons emp2 = new empCons("Archu", 5); //object use panni we call instance variable
	    
//		emp2.empName="Archu";
//		emp2.empID = 2;
		
		System.out.println("Employee Name "+ emp2.empName + " Employee ID "+ emp2.empID);
		
		

	}
	
	// cant we directly pass values to method thru object. constructor concept clear

}

