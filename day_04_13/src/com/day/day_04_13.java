package com.day;

import java.util.ArrayList;
import java.util.Arrays;

public class day_04_13 {

	public static void main(String[] args) {
		ArrayList<int[]> list_array = new ArrayList<int[]>();
		list_array.add(new int[3]);
		System.out.println(list_array.get(0)[0]);
		
	}
	static void array_list_test() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<String> string_list = new ArrayList<String>();
		list.add(100);
		list.add(200);
		list.add(300);
		//string_list add
		string_list.add("학원");
		string_list.add("7번 출석");
		string_list.add("93번남음");
		string_list.add("이번주 지나면 10프로");	
		for (int i = 0; i < 100; i++) {
			list.add(10*(i+1));
		}
//		list 크기확인 size()
//		System.out.println(list.size());
//		string_list크기 확인
//		System.out.println(string_list.size());
		int s = list.size();
		for (int i = 0; i < s; i++) {
//			System.out.println(string_list.get(i));
			//remove for 문 i는 0,0,1
			list.remove(0);
			System.out.printf("%d번째\n",i);
//			2번째라는 값이 들어가지 않는다. 
			System.out.println(list.size());
//			System.out.println(list);
			
		}
		System.out.println(list.size());
		//remove
		
		
	}
	static int test(int c) {
		System.out.println("계속계속가");
		if(c == 0)
			return c;
		else
			return test(--c);
		
	}
	static void string_for() {
		String text = "hello=2;world=3;test=5;counts=7";
		String[] n_text = text.split(";");
		char[][] c_a2 = new char[n_text.length][];
		
//		System.out.println(n_text.length);
//		System.out.println(n_text.length);
		for(int i = 0 ; i<n_text.length; i++) {
			c_a2[i] = new char[n_text[i].length()];
			for (int j = 0; j < c_a2[i].length; j++) {
				c_a2[i][j] = n_text[i].charAt(j);
//				System.out.print(c_a2[i][j]);
			}
//			System.out.println();
		}
		// 2차 배열을 사용해서 구구단을 구현
		int[][] left_num = new int[10][];
		
//		for (int i = 1; i < left_num.length; i++) {
//			left_num[i] = new int[10]; // 변수의 크기 지정해줄 때 사용.!
//			for (int j = 1; j < left_num.length; j++) {
//				left_num[i][j] = i*j;
//				System.out.print(left_num[i][j]+"\t");
//			}
//			System.out.println();
//		}
//		int[][] array = new int[8][9];
//		
//		for (int i = 2; i < 10; i++) {
//			for (int j = 1; j < 10; j++) {
//				array[i-2][j-1] = i * j;
//			}
//		}
//		
//		for (int i = 0; i < array.length; i++) {
//			System.out.print((i+2)+"단:");
//			System.out.println(Arrays.toString(array[i]));
//			System.out.println();
//		}
		char c = '*';
		int[][] num = new int[5][];
		for (int i = 1; i < 6; i++) {
			for (int j = 5; j > 0; j--) {
				if (i<j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		for (int i = 5; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	static void string_split() {
		String text = "hello=2;world=3;test=5;counts=7";
		String[] n_text = text.split(";");
//		System.out.println(n_text.length);
		for (int i = 0; i < n_text.length; i++) {

//			System.out.println(n_text[i].charAt(n_text[i].length()-1));
//			int n = Integer.parseInt(n_text[i].charAt(n_text[i].length() - 1)+"");
//			System.out.println(n_text[i].indexOf("=")+1);
			int ni = Integer.parseInt(n_text[i].charAt(n_text[i].indexOf("=")+1)+"");
			
			
//			System.out.println(ni);
			
//			System.out.println(n*10);
//			System.out.println(n_text[i].indexOf("="));
		}
	}
	static void lotto_shuffle() {

		int[] lotto = new int[45];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
//			System.out.println(lotto[i]);
		}
//		for (int i = 0; i < lotto.length-1; i++) {
//			for (int j = 0; j < lotto.length; j++) {
//				if(lotto[i] == lotto[j]) {
////					System.out.println(lotto[i]);
//				}
//			}
//		}
		for (int i = 0; i < 1000; i++) {
			int r = (int) (Math.random() * 44) + 1;
			int tmp = lotto[0];
			lotto[0] = lotto[r];
			lotto[r] = tmp;
		}
		for (int i = 0; i < 7; i++) {
//			System.out.println(lotto[i]);
		}
		for (int i = 0; i < 6; i++) {
			for (int j = i + 1; j < 7; j++) {
				if (lotto[i] > lotto[j]) {
					int tmp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = tmp;
				}
			}
//			System.out.println(lotto[i]);
		}
		// selection sorting
//		for (int i = lotto.length-1; i > 0; i--) {
//			int max = i;
//			for (int j = i - 1; j >= 0; j--) {
//				if 
//			}
//			
	}

	static void lotto() {
		// 금요일, 월요일 복습!!! lotto

		// 배열 크기 생성
		int[] lotto = new int[45];
		int[] lotto2 = { 1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25,
				26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44 };

		// 로또 1~45까지 반복문 사용해서 넣어주기, 잘들어갓는지 확인하기
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
//			System.out.println(lotto[i]);
		}
		// 중복값 확인하기
//		for (int i = 44; i > 0; i--) {
//			System.out.println(lotto2[i]);
//			System.out.println(lotto2[i-1]);
//			System.out.println("=======");
//			if (lotto2[i] == lotto2[i-1]) 
//				System.out.println(lotto2[i]+"\s"+"중복값 발견!");
//			 else {
//							System.out.println("중복값이 없습니다.");
//		}		

//		for (int i = 0; i < lotto2.length-1; i++) {
//			System.out.println(lotto[i]);
//			for (int j = 1+ i; j < lotto2.length; j++) {
//				if(lotto2[i] == lotto2[j]) {
//					System.out.println(lotto[i]);
//				}
//				
//			}
//			
//		}

	}

	static void string_test() {
		String text = "위키백과는 종이 기반 참고 자료와는 아주 다르게 실시간으로 함께 편집합니다. "
				+ "위키백과는 끊임없이 새로 만들어지고 갱신되므로 역사적 사건에 관한 항목은 수분 내에 생성됩니다. "
				+ "반면에 종이 기반 백과사전에서는 이와 같은 과정이 수개월이나 수년이 걸립니다. " + "오래 전에 생성된 항목은 시간이 가면서 점점 더 일반화되고 중립적 시각으로 변합니다. "
				+ "새로 만들어진 항목은 잘못된 정보, 백과사전에 싣기에 부적절한 내용 또는 문서를 훼손하는 내용을 포함할 수 있습니다."
				+ " 이 점을 주의하면 유용한 정보를 취하고 잘못된 정보를 피하는 데 도움이 됩니다.";
		// 비교 문자는 '는, 으' 문자가 몇번 있는지 확인하세요
//	System.out.println(text.charAt(0));
//	char[] char_1 = new char[text.length()];
		int s = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == '는' | text.charAt(i) == '으') {
				s++;
			}
		}
//	System.out.println("는과으는\s"+s+"번 나왔습니다.");

		String t = text.trim();
		t = t.replace(" ", "");
//		System.out.println(t);
//		System.out.println(t.length());

		char[] ca = new char[t.length()];
		String ns = "";

//		for (int i = 0; i < text.length(); i++) {
//			if (text.charAt(i) == '는' | text.charAt(i) == '으') {
//				for (int j = 0; j < ca.length; j++) {
//					ca[j] = text.charAt(i);
//				}
//			}
//		}
//		System.out.println(ca.length);
		for (int i = 0; i < ca.length; i++) {
			ca[i] = t.charAt(i);
//			ns += ca[i];
		}
//		for (int i = 0; i < ca.length; i++) {
//			System.out.println(ca[i]);
//		}
		char[] ca2 = t.toCharArray();
		for (int i = 0; i < ca2.length - 1; i++) {
			for (int j = 1 + i; j < ca2.length; j++) {
				if (ca2[i] == ca2[j]) {
					ca2[j] = ' ';
//					System.out.println(ca2[i]);
				}
			}

		}
		for (int i = 0; i < ca2.length; i++) {
			ns += ca2[i];
		}
		t = ns.replace(" ", "");
		char[] c3 = t.toCharArray();
		for (int i = 0; i < c3.length; i++) {
			System.out.println(c3[i]);
		}
//		String tt = "hello";
//		
//		char c2 = tt.charAt(0);
//		System.out.println(c2);
	}
}
