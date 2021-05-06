package com.day;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class day_04_14 {

	public static void main(String[] args) {

		ArrayList<int[][]> list_a2 = new ArrayList<int[][]>();
		int[] array_int = {100, 200, 300};
		int[][] array_int2 = {{1, 2, 3},{4, 5, 6},{100, 200, 300}};
		System.out.println(array_int2.length);
		System.out.println(array_int2[0].length);
		
		
		
		list_a2.add(array_int2);
		list_a2.add(array_int2);
		System.out.println(list_a2);
		
		//for문을 세번 돌립시다아~~~ 
		for (int i = 0; i < list_a2.size(); i++) {
			System.out.println(list_a2.get(i));
			for (int j = 0; j < array_int2.length; j++) {
				System.out.println(list_a2.get(i)[j]);
				for (int s = 0; s < array_int2[j].length; s++) {
					System.out.print(list_a2.get(i)[j][s]+",");
				}
				System.out.println();
			   }
		}
		
		int[][][] int_a3 = new int[list_a2.size()][][];
//		int_a3[0] = new int[2][];
//		int_a3[1] = new int[2][];
//		
//		int_a3[0][0] = new int[2];
//		int_a3[0][1] = new int[2];
//		
//		int_a3[1][0] = new int[2];
//		int_a3[1][1] = new int[2];
//		
		for (int i = 0; i < int_a3.length; i++) {
			int_a3[i] = new int[2][];
			for (int j = 0; j < int_a3[i].length; j++) {
				int_a3[i][j] = new int[2];
				for (int j2 = 0; j2 < int_a3[i][j].length; j2++) {
					int_a3[i][j][j2] = j2;
					System.out.print(int_a3[i][j][j2]+",");
				}System.out.println();
			}
			
		}
		
		
}

	static void test() {

		String n = new String();
		String n2 = new String("hello");

		A_class aa = new A_class(); // A.java를 사용해서 a라는 객체에 A.java를 복사해서 담아준다.

		// B_class b = new B_class(); // instance 화/ instance라고도 부르고/ 객체라고 부른다. 세개다
		// 같은말이라고 생각하면 편함.
		// new 연산자에 의해서 heap에 할당되게 되었다.

		// interface 내용은 없고 몸통만 있는것

	}

	static void timeCurrent(List<Integer> l) {
		double startTime = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			l.add((i+1)*10);
			}
		for (int i = 0; i < 100000; i++) {
			l.remove(0);
			}
		double endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}
	
	static void timeCurrent(LinkedList<Integer> l) {
		double startTime = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			l.add((i+1)*10);
			}
		for (int i = 0; i < 100000; i++) {
			l.remove(0);
			}
		double endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}
	static void interface_test(I_interface l) {
		l.tests();
	}
	static void list_array() {
		// 이것이 다양성이구나!
		
				ArrayList<Integer> list = new ArrayList<Integer>();
				LinkedList<Integer> list_i = new LinkedList<Integer>();

//				timeCurrent(list);
//				System.out.println("******");
//				timeCurrent(list_i);
//				System.out.println(list.size());
				
				ArrayList<int[]> int_a_list = new ArrayList<int[]>();
				int[] array_int = new int[10];
				for (int i = 0; i < array_int.length; i++) {
					array_int[i] = i;
				}
				int_a_list.add(array_int);
				int_a_list.add(array_int);
//				System.out.println(int_a_list.);
//				System.out.println(int_a_list.size());
//				System.out.println(int_a_list.get(0).length);
				int [][] list2 = new int[int_a_list.size()][];
//				System.out.println(list2.length);
				for (int i = 0; i < list2.length; i++) {
					list2[i] = new int[int_a_list.get(0).length+1];
					for (int j = 0; j < int_a_list.get(0).length+1; j++) {
						System.out.print(i+","+j+"\t");
						list2[i][j] = int_a_list.get(i)[j];
						System.out.println(list2[i][j]);
					}
				}
				for (int i = 0; i < list2.length; i++) {
					System.out.println(list2[i].length);
					for (int j = 0; j < list2[i].length; j++) {
						System.out.print(list2[i][j]);
					}System.out.println();
					}
				
//				for (int i = 0; i < list2.length; i++) {
//					System.out.println(list2[i]);
//				}
//				for (int i = 0; i < int_a_list.size(); i++) {
//					System.out.println((i+1)+"번째 돌아갑니다.");
//					for (int j = 0; j < int_a_list.get(0).length; j++) {
//						System.out.print(int_a_list.get(i)[j]);
//					}
//					System.out.println();	
//				}
				// 연못에 연꽃이 기하급수적 2**n 반이 차려면 99일 다차려면 몇일?
			
				String text = "hello;world;test;counts";
				String[] tp = text.split(";");
				char[][] ca = new char[tp.length][];
				System.out.println(tp.length);
				for (int i = 0; i < tp.length; i++) {
					ca[i] = new char[tp[i].length()];
					for (int j = 0; j < ca[i].length; j++) {
						ca[i][j] = tp[i].charAt(j);
					}
					System.out.println(ca[i]);
				}
				int[][] numb1 = {
						{1, 2, 3},
						{4, 5, 6}
				};
				for (int i = 0; i < numb1.length; i++) {
					for (int j = 0; j < numb1[i].length; j++) {
						System.out.println(numb1[i][j]);
					}
				}
	}
}
