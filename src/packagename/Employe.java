package packagename;

class Employe{
    public int empId;
	public String empName;
	
	Employe(int empId, String empName){
		this.empId = empId;
		this.empName = empName;
	}
//	public boolean equals(Employe ob){
//		if(this.empId == ob.empId)
//			return true;
//		else
//		    return false;
//	}
	public static void main(String[] args){
		Employe obj = new Employe(1, "Archu");
		Employe obj2 = new Employe(1, "Aswanth");
		System.out.println(obj.equals(obj2));
		System.out.println(obj.toString());
	}
	@Override
	public String toString() {
		return "Employe [empId=" + empId + ", empName=" + empName + "]";
	}
}