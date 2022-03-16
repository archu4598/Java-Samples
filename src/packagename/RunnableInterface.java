package packagename;

public class RunnableInterface implements Runnable {

	@Override
	public void run() {
		System.out.println("Am running");
	}

	public static void main(String[] args) {
		RunnableInterface RI = new RunnableInterface();
		Thread trd = new Thread(RI);
		trd.start();

	}

}
