package doo.know;

import java.util.Scanner;

public class Array_1 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Person ps[] = new Person[5];
	 for (int i = 0; i < ps.length; i++) {
		 System.out.println("����� �Ż� ������ �Է����ּ���");
		ps[i] = new Person(scan.next(),scan.nextInt(),scan.nextDouble(), scan.nextDouble());
	}	
	
	 for (int i = 0; i < ps.length; i++) {
		System.out.println(ps[i].toString());
	}
	}

}
