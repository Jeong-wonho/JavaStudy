package chap12;

public class ThreadYieldA extends Thread {
	public boolean stop = false;
	public boolean work = true;

	public void run() {
		while (!stop) { // stop�� true�� �Ǹ� �۾� ����
			if (work) {
				System.out.println("ThreadAyield �۾� ����");
			} else {
				Thread.yield(); // work�� false�� �Ǹ� �ٸ� �����忡�� ���� �纸
			}
		}
		System.out.println("ThreadAYield ����");
	}

}
