package packagename;

public class Trycatch {
	int rollno;
	String name; 
    public void example1(){
    	try {
    		int a;
    		a=2/0;
    		System.out.println(a);
    	} catch(ArithmeticException a) {
    		//System.out.println("Am failed");
    		System.out.println(a.getMessage());
    	}
    	
    }
    Trycatch(int r, String n){
    	rollno = r;
    	name = n;
    	
    }
	public static void main(String[] args) {
		
		Trycatch tc = new Trycatch(3, "Archana");
		tc.example1();
	}

}
