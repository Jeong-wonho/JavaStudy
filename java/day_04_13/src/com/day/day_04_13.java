//package com.day;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class day_04_13 {
//
//	public static void main(String[] args) {
//		ArrayList<int[]> list_array = new ArrayList<int[]>();
//		list_array.add(new int[3]);
//		System.out.println(list_array.get(0)[0]);
//		
//	}
//	static void array_list_test() {
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		ArrayList<String> string_list = new ArrayList<String>();
//		list.add(100);
//		list.add(200);
//		list.add(300);
//		//string_list add
//		string_list.add("�п�");
//		string_list.add("7�� �⼮");
//		string_list.add("93������");
//		string_list.add("�̹��� ������ 10����");	
//		for (int i = 0; i < 100; i++) {
//			list.add(10*(i+1));
//		}
////		list ũ��Ȯ�� size()
////		System.out.println(list.size());
////		string_listũ�� Ȯ��
////		System.out.println(string_list.size());
//		int s = list.size();
//		for (int i = 0; i < s; i++) {
////			System.out.println(string_list.get(i));
//			//remove for �� i�� 0,0,1
//			list.remove(0);
//			System.out.printf("%d��°\n",i);
////			2��°��� ���� ���� �ʴ´�. 
//			System.out.println(list.size());
////			System.out.println(list);
//			
//		}
//		System.out.println(list.size());
//		//remove
//		
//		
//	}
//	static int test(int c) {
//		System.out.println("��Ӱ�Ӱ�");
//		if(c == 0)
//			return c;
//		else
//			return test(--c);
//		
//	}
//	static void string_for() {
//		String text = "hello=2;world=3;test=5;counts=7";
//		String[] n_text = text.split(";");
//		char[][] c_a2 = new char[n_text.length][];
//		
////		System.out.println(n_text.length);
////		System.out.println(n_text.length);
//		for(int i = 0 ; i<n_text.length; i++) {
//			c_a2[i] = new char[n_text[i].length()];
//			for (int j = 0; j < c_a2[i].length; j++) {
//				c_a2[i][j] = n_text[i].charAt(j);
////				System.out.print(c_a2[i][j]);
//			}
////			System.out.println();
//		}
//		// 2�� �迭�� ����ؼ� �������� ����
//		int[][] left_num = new int[10][];
//		
////		for (int i = 1; i < left_num.length; i++) {
////			left_num[i] = new int[10]; // ������ ũ�� �������� �� ���.!
////			for (int j = 1; j < left_num.length; j++) {
////				left_num[i][j] = i*j;
////				System.out.print(left_num[i][j]+"\t");
////			}
////			System.out.println();
////		}
////		int[][] array = new int[8][9];
////		
////		for (int i = 2; i < 10; i++) {
////			for (int j = 1; j < 10; j++) {
////				array[i-2][j-1] = i * j;
////			}
////		}
////		
////		for (int i = 0; i < array.length; i++) {
////			System.out.print((i+2)+"��:");
////			System.out.println(Arrays.toString(array[i]));
////			System.out.println();
////		}
//		char c = '*';
//		int[][] num = new int[5][];
//		for (int i = 1; i < 6; i++) {
//			for (int j = 5; j > 0; j--) {
//				if (i<j) {
//					System.out.print(" ");
//				}else {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
//		for (int i = 5; i > 0; i--) {
//			for (int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//	}
//	static void string_split() {
//		String text = "hello=2;world=3;test=5;counts=7";
//		String[] n_text = text.split(";");
////		System.out.println(n_text.length);
//		for (int i = 0; i < n_text.length; i++) {
//
////			System.out.println(n_text[i].charAt(n_text[i].length()-1));
////			int n = Integer.parseInt(n_text[i].charAt(n_text[i].length() - 1)+"");
////			System.out.println(n_text[i].indexOf("=")+1);
//			int ni = Integer.parseInt(n_text[i].charAt(n_text[i].indexOf("=")+1)+"");
//			
//			
////			System.out.println(ni);
//			
////			System.out.println(n*10);
////			System.out.println(n_text[i].indexOf("="));
//		}
//	}
//	static void lotto_shuffle() {
//
//		int[] lotto = new int[45];
//		for (int i = 0; i < lotto.length; i++) {
//			lotto[i] = i + 1;
////			System.out.println(lotto[i]);
//		}
////		for (int i = 0; i < lotto.length-1; i++) {
////			for (int j = 0; j < lotto.length; j++) {
////				if(lotto[i] == lotto[j]) {
//////					System.out.println(lotto[i]);
////				}
////			}
////		}
//		for (int i = 0; i < 1000; i++) {
//			int r = (int) (Math.random() * 44) + 1;
//			int tmp = lotto[0];
//			lotto[0] = lotto[r];
//			lotto[r] = tmp;
//		}
//		for (int i = 0; i < 7; i++) {
////			System.out.println(lotto[i]);
//		}
//		for (int i = 0; i < 6; i++) {
//			for (int j = i + 1; j < 7; j++) {
//				if (lotto[i] > lotto[j]) {
//					int tmp = lotto[i];
//					lotto[i] = lotto[j];
//					lotto[j] = tmp;
//				}
//			}
////			System.out.println(lotto[i]);
//		}
//		// selection sorting
////		for (int i = lotto.length-1; i > 0; i--) {
////			int max = i;
////			for (int j = i - 1; j >= 0; j--) {
////				if 
////			}
////			
//	}
//
//	static void lotto() {
//		// �ݿ���, ������ ����!!! lotto
//
//		// �迭 ũ�� ����
//		int[] lotto = new int[45];
//		int[] lotto2 = { 1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25,
//				26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44 };
//
//		// �ζ� 1~45���� �ݺ��� ����ؼ� �־��ֱ�, �ߵ����� Ȯ���ϱ�
//		for (int i = 0; i < lotto.length; i++) {
//			lotto[i] = i + 1;
////			System.out.println(lotto[i]);
//		}
//		// �ߺ��� Ȯ���ϱ�
////		for (int i = 44; i > 0; i--) {
////			System.out.println(lotto2[i]);
////			System.out.println(lotto2[i-1]);
////			System.out.println("=======");
////			if (lotto2[i] == lotto2[i-1]) 
////				System.out.println(lotto2[i]+"\s"+"�ߺ��� �߰�!");
////			 else {
////							System.out.println("�ߺ����� �����ϴ�.");
////		}		
//
////		for (int i = 0; i < lotto2.length-1; i++) {
////			System.out.println(lotto[i]);
////			for (int j = 1+ i; j < lotto2.length; j++) {
////				if(lotto2[i] == lotto2[j]) {
////					System.out.println(lotto[i]);
////				}
////				
////			}
////			
////		}
//
//	}
//
//	static void string_test() {
//		String text = "��Ű����� ���� ��� ���� �ڷ�ʹ� ���� �ٸ��� �ǽð����� �Բ� �����մϴ�. "
//				+ "��Ű����� ���Ӿ��� ���� ��������� ���ŵǹǷ� ������ ��ǿ� ���� �׸��� ���� ���� �����˴ϴ�. "
//				+ "�ݸ鿡 ���� ��� ������������� �̿� ���� ������ �������̳� ������ �ɸ��ϴ�. " + "���� ���� ������ �׸��� �ð��� ���鼭 ���� �� �Ϲ�ȭ�ǰ� �߸��� �ð����� ���մϴ�. "
//				+ "���� ������� �׸��� �߸��� ����, ��������� �Ʊ⿡ �������� ���� �Ǵ� ������ �Ѽ��ϴ� ������ ������ �� �ֽ��ϴ�."
//				+ " �� ���� �����ϸ� ������ ������ ���ϰ� �߸��� ������ ���ϴ� �� ������ �˴ϴ�.";
//		 �� ���ڴ� '��, ��' ���ڰ� ��� �ִ��� Ȯ���ϼ���
//	System.out.println(text.charAt(0));
//	char[] char_1 = new char[text.length()];
//		int s = 0;
//		for (int i = 0; i < text.length(); i++) {
//			if (text.charAt(i) == '��' | text.charAt(i) == '��') {
//				s++;
//			}
//		}
//	System.out.println("�°�����\s"+s+"�� ���Խ��ϴ�.");
//
////		String t = text.trim();
////		t = t.replace(" ", "");
//////		System.out.println(t);
//////		System.out.println(t.length());
////
////		char[] ca = new char[t.length()];
////		String ns = "";
//
////		for (int i = 0; i < text.length(); i++) {
////			if (text.charAt(i) == '��' | text.charAt(i) == '��') {
////				for (int j = 0; j < ca.length; j++) {
////					ca[j] = text.charAt(i);
////				}
////			}
////		}
////		System.out.println(ca.length);
//		for (int i = 0; i < ca.length; i++) {
//			ca[i] = t.charAt(i);
////			ns += ca[i];
//		}
////		for (int i = 0; i < ca.length; i++) {
////			System.out.println(ca[i]);
////		}
//		char[] ca2 = t.toCharArray();
//		for (int i = 0; i < ca2.length - 1; i++) {
//			for (int j = 1 + i; j < ca2.length; j++) {
//				if (ca2[i] == ca2[j]) {
//					ca2[j] = ' ';
////					System.out.println(ca2[i]);
//				}
//			}
//
//		}
//		for (int i = 0; i < ca2.length; i++) {
//			ns += ca2[i];
//		}
//		t = ns.replace(" ", "");
//		char[] c3 = t.toCharArray();
//		for (int i = 0; i < c3.length; i++) {
//			System.out.println(c3[i]);
//		}
////		String tt = "hello";
////		
////		char c2 = tt.charAt(0);
////		System.out.println(c2);
//	}
//}
