package chap12;

public class JoinExample {
	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();

		try {
			sumThread.join(); // sumThread�� ������ �� ���� ���� �����帣 ���Ͻ� ���� ��Ŵ
		} catch (InterruptedException e) {
		}

		System.out.println("1~100 ��:" + sumThread.getSum());
	}
}
