package chap12;

public class WorkObject {
	public synchronized void methodA() {
		System.out.println("ThreadA�� methodA() �۾� ����");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB �� methodB() �۾� ����");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {}
	}
}
