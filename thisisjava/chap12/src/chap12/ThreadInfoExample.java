package chap12;

import java.util.Map;
import java.util.Set;

public class ThreadInfoExample {
	/**
	 * ������ �׷�
	 * 1. �����带 ��� ������ ����
	 * 2. �ݵ�� �ϳ��� ������ �׷쿡 ����
	 * 3. ������� ������ �ڽ��� ������ ������� ���� ������ �׷쿡 ����
	 * (��κ� main�����忡 �����ִ�.)
	 *
	 */
	
	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setName("AutoSaveThread");
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		
		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
		Set<Thread> threads = map.keySet();
		for(Thread thread : threads) {
			System.out.println("Name:" + thread.getName() + 
					((thread.isDaemon())?"(����)":"(��)"));
			
			System.out.println("\t" + "�Ҽӱ׷�:" + thread.getThreadGroup().getName());
			System.out.println();
		}
	}
}
