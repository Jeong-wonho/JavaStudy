package chap12;

public class ThreadYieldA extends Thread {
	public boolean stop = false;
	public boolean work = true;

	public void run() {
		while (!stop) { // stop이 true가 되면 작업 종료
			if (work) {
				System.out.println("ThreadAyield 작업 내용");
			} else {
				Thread.yield(); // work가 false가 되면 다른 스레드에게 실행 양보
			}
		}
		System.out.println("ThreadAYield 종료");
	}

}
