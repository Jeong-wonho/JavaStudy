package chap12;

public class WorkThread extends Thread {
	/**
	 * 스레드 그룹의 일괄 Interrupt(), 10개의 쓰레드를 돌릴 경우 Interrupt를 사용하면 한번에 정지 할 수 있다. 안전한
	 * 종료를 위해선, 개별 쓰레드 예외 처리 필요
	 */
	public WorkThread(ThreadGroup threadGroup, String threadName) {
		super(threadGroup, threadName);
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(getName() + " interrupted");
				break;
			}
		}
		System.out.println(getName() + " 종료됨");
	}
}
