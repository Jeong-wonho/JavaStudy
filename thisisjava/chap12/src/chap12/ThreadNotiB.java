package chap12;

public class ThreadNotiB extends Thread{
	private WorkObject workObject;
	
	public ThreadNotiB(WorkObject workObject) {
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			workObject.methodB();
		}
	}
}
