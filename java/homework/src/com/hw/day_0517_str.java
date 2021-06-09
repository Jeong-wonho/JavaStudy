//package com.hw;
//
//public class day_0517_str {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		file_reader file = new file_reader("str.txt");
//		file.arr.get(0);
//		int i = 0;
//		while (i < file.arr.size()) {
//
//			String a = file.arr.get(i).split(",")[0];
//			String b = file.arr.get(i).split(",")[1];
//			String a2 = "";
//			String b2 = "";
////			System.out.println("a:" + a);
////			System.out.println("b:" + b);
//			int s = a.length();
//			int t = b.length();
//
////			System.out.println("s:"+s);
////			System.out.println("t:"+t);
//			Gcd gcd = new Gcd();
//			int[] len = gcd.solution(s, t);
////			System.out.println("len:"+len[1]);
//
//			while (s < len[1] || t < len[1]) {
//
//				if (s < len[1]) {
//					a = a.repeat(len[1]/s);
//					s = a.length();
////					System.out.println("a2:" + a.length());
//				} else if (t <= len[1]) {
//					b = b.repeat(len[1]/t);
//					t = b.length();
////					System.out.println("b2:" + b.length());
//				}
//
//			}
//			if (a.equals(b)) {
//				System.out.println((i + 1) + "��° ����:" + 1);
//			} else {
//				System.out.println((i + 1) + "��° ����:" + 0);
//			}
//			i++;
//		}
//	}
//
//}
