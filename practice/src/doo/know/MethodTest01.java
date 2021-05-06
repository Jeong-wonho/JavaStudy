package doo.know;

import java.util.Scanner;

class Number{

	public int getNumber() {
		return 10;
	}
		
	String getName() {
		return "ȫ�浿";
	}
	
	void showinfo() {
		System.out.println("instance message");
	}
	
	int num_plus(int i, int j) {
		
		return i + j;
	}
	
}



public class MethodTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number info = new Number();
		System.out.println(info.getNumber());
		System.out.println(info.getName());
		info.showinfo();
		
		Scanner scan = new Scanner(System.in);
		
		int i = scan.nextInt();
		int j = scan.nextInt();
		
		System.out.println(info.num_plus(i, j));
		scan.close();
	}

}
