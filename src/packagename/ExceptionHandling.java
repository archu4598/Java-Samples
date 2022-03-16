package packagename;

public class ExceptionHandling {
	public static void main(String[] args) {
		try {
			System.out.println(2 / 0);
		} catch (ArithmeticException e) {
		  System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getClass());
		}
		finally {
			System.out.println("Sorry for the disturbance");
		}
	}
}
