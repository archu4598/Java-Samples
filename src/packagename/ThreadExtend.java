package packagename;

public class ThreadExtend extends Thread{
	
	public void run() {
		System.out.println("I am thread");
		fast();
		work();
	}
	public void fast() {
		for(int i =0; i<=100; i++) {
			System.out.println(i);
		}
	}
	public void work() {
		for(int i =100; i<=200; i++) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		ThreadExtend te = new ThreadExtend();
		te.start(); // calling using thread mechanism. run called from thread class
	}
}
