package packagename;

public class Funfact {

	public static void main(String[] args){
		
       int a = 10;
       int b = 10;
       if(a==b)
       {
    	   System.out.println("Equal");
       }else
    	   System.out.println("Not equal");
       
       String str1 = "Archu";
       String str2 = "Archu";
       if(str1==str2)
       {
    	   System.out.println("Equal");
       }else
    	   System.out.println("Not equal");
       
       String str3 = new String("Archu");
       String str4 = new String("Archu"); // double equals checks for the wrapper and user defined class address 
       if(str3==str4)                     // if its primitive, then its check for data
       {
    	   System.out.println("Equal");
       }else
    	   System.out.println("Not equal");
       
	}

}
