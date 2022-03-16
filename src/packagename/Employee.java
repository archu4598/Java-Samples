package packagename;

public class Employee {
    private String empName;
    private String empDesignation;
    
    
    
   
	public String getEmpName() {
		return empName;
	}




	public void setEmpName(String empName) {
		this.empName = empName;
	}




	public String getEmpDesignation() {
		return empDesignation;
	}




	public Employee(String empName, String empDesignation) {
		super();
		this.empName = empName;
		this.empDesignation = empDesignation;
	}




	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
