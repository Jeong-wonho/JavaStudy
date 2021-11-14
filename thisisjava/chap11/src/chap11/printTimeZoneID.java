package chap11;

import java.util.TimeZone;

public class printTimeZoneID {
	public static void main(String[] args) {
		String[] availaleIDs = TimeZone.getAvailableIDs();
		int i = 1;
		for(String id:availaleIDs) {
			System.out.print(i++ + " ");
			System.out.println(id);
		}
	}
}
