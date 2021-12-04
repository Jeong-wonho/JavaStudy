package chap12;

import java.util.Map;
import java.util.Set;

public class ThreadInfoExample {
	/**
	 * 스레드 그룹
	 * 1. 스레드를 묶어서 관리할 목적
	 * 2. 반드시 하나의 스레드 그룹에 포함
	 * 3. 명시하지 않으면 자신을 생성한 스레드와 같은 스레드 그룹에 속함
	 * (대부분 main스레드에 속해있다.)
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
					((thread.isDaemon())?"(데몬)":"(주)"));
			
			System.out.println("\t" + "소속그룹:" + thread.getThreadGroup().getName());
			System.out.println();
		}
	}
}
