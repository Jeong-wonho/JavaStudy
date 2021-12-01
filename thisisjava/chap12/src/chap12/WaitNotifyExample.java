package chap12;

public class WaitNotifyExample {
	public static void main(String[] args) {
		WorkObject sharedObject= new WorkObject();
		
		ThreadNotiA threadA =  new ThreadNotiA(sharedObject);
		ThreadNotiB threadB = new ThreadNotiB(sharedObject);
		
		threadA.start();
		threadB.start();
	}
}
