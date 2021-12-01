package chap12;

public class JoinExample {
	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();

		try {
			sumThread.join(); // sumThread가 종료할 때 가지 메인 스레드르 ㄹ일시 정시 시킴
		} catch (InterruptedException e) {
		}

		System.out.println("1~100 합:" + sumThread.getSum());
	}
}
