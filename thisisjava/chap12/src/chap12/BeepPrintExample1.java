package chap12;

import java.awt.Toolkit;

public class BeepPrintExample1 {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // Toolkit °´Ã¼¸¦ ¾ò´Â´Ù.
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try { Thread.sleep(500);} catch(Exception e) {}
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println("¶ò");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
