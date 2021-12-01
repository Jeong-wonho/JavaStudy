package chap12;

public class ThreadNotiA extends Thread{
	private WorkObject workObject;
	
	public ThreadNotiA(WorkObject workObject) {
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			workObject.methodA();
		}
	}
}
