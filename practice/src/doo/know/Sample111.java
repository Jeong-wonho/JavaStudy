package doo.know;

import java.util.Scanner;

public class Sample111 {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// �Ž������� ������ �������� ��� ������ �ʿ����� ������ּ���.
		int money = (int)(Math.random() + 500) * 10; //10��~4950��
		int[] coin = {500, 100, 50, 10};

		System.out.println("�Ž����� : " + money + "��");
		for(int i = 0; i < coin.length; i++){
			System.out.println(coin[i] + "�� : " + money/coin[i] + "��");
		    	money = money % coin[i];
		}
		
	}
}
