package chap12;

public class WorkObject {
	public synchronized void methodA() {
		System.out.println("ThreadA의 methodA() 작업 실행");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB 의 methodB() 작업 실행");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {}
	}
}
