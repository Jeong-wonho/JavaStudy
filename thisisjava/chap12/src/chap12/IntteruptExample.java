package chap12;

public class IntteruptExample {
	public static void main(String[] args) {
		Thread thread = new PrintThread2();
		thread.start();
		
		try { Thread.sleep(1000);} catch (InterruptedException e) {}
		
		
		thread.interrupt();		
	}
}
