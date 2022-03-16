package packagename;

public class ThrowException {

	public static void test() {
		try {
			test1();
			System.out.println(2 / 0);
		} catch (ArithmeticException e) {
			throw e;
		} catch (Exception e) {
			//throw e;
		}
		finally {
			System.out.println("Hi");
		}
		
	}

	public static void test1() throws Exception{
//		try {
//			String[] arr = { "Arch", "Aswanth" };
//			System.out.println(arr[5]);
//		} catch (ArrayIndexOutOfBoundsException e) {
//			throw e;
//		}
		test3();
	}
	
	public static void test3() throws ArithmeticException, Exception {
		System.out.println(2/0);
	
	}

	public static void main(String[] args) {
//		try {
//			ThrowException.test();
//			
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		System.out.print("\\");
		try {
			test3();
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println(e.getClass());
		}
		

	}
}

// single line comment
/* Multi line comment */ 

/** - documentation comment - */
//\n - new line
//\t - tab, escape characters