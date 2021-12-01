package chap12;

public class YieldExample {
	public static void main(String[] args) {
		ThreadYieldA threadA = new ThreadYieldA();
		ThreadYieldB threadB = new ThreadYieldB();

		threadA.start();
		threadB.start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		threadA.work = false;

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		threadA.work = true;

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		threadA.stop = true;
		threadB.stop = true;
	}
}
