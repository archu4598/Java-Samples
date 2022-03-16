package Methover;

public class Methoverload {

	public int sum(int a, int b) {
		return a+b;
	}
	public void sum(String a, int b) {
		System.out.println(a + b);
	}
	public int sum(int a, int b, int c, int d) {
		return (a+b+c+d);
	}
	public static void main(String[] args) {
		
		Methoverload addition = new Methoverload();
		addition.sum("Pavi", 3);
//		System.out.println(addition.sum(2, 4, 6, 8));
//		System.out.println(addition.sum(2, 2));	
	}
}

