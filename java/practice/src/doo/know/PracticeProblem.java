package doo.know;

import java.util.Arrays;

public class PracticeProblem {
	public static void main(String[] arg) {
		/*1~5 ������ ������ ���� 10�� ����� �迭���� �ߺ��� ���� ���ŵ� �迭�� ������ּ���.
		ex) [1, 3, 3, 2, 1, 1, 4, 5, 5, 1, 3] ->[1, 3, 2, 4, 5]*/
		int[] array = new int[10];
		
		for (int i = 0; i < array.length; i++) {
			int num = (int)(Math.random()*5+1);
			array[i] = num;
			System.out.print(array[i]+" ");
		}
		System.out.println();
		System.out.println("===�ߺ�����===");
		
		int count = 0;
		int[] temp = new int[10];
		for (int i = array.length-1; i > 0; i--) {
			if(array[i] != array[i-1]) {
				System.out.print(array[i]+" ");
				temp[count++] = array[i];
			} 
			
		}
		System.out.println();
		System.out.println(count);
		
		int[] set_array = new int[count];
		for (int i = 0; i < set_array.length; i++) {
			set_array[i] = temp[i];
		}
		System.out.println(Arrays.toString(set_array));
	
	}
	static void problem1() {
		int money = (int)(Math.random()*10+500) * 10;
		int[] coin = {500, 100, 50, 10};
		
		System.out.println("�Ž�����:"+money+"��");
		
		for (int i = 0; i < coin.length; i++) {
			System.out.println(coin[i] + "��:" + money/coin[i] + "��");
			money = money % coin[i];
		
	}
}
}