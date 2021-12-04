package chap12;

public class WorkThread extends Thread {
	/**
	 * ������ �׷��� �ϰ� Interrupt(), 10���� �����带 ���� ��� Interrupt�� ����ϸ� �ѹ��� ���� �� �� �ִ�. ������
	 * ���Ḧ ���ؼ�, ���� ������ ���� ó�� �ʿ�
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
		System.out.println(getName() + " �����");
	}
}
