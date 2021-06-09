package com.day;

public class day_04_12 {

	public static void main(String[] args) {
		
		array_test2();
		
		}
		// 매우 중요! 3차원 배열의 주소 값은 뭐지..?! 배열은 주소의 개념을 명확하게 가지고 있어야 한다.!! 
	static void Stringtochar2() {
		String text = "hello;world;tes;countss";
		String[] sa = text.split(";"); // split도 배열이다. string 배열을 return 한다. 
		char [][] cas = new char[sa.length][]; // 크기 설정
		for (int i = 0; i < cas.length; i++) {
			cas[i] = new char[sa[i].length()]; // 동수 안에 호 설정.!
			for (int j = 0; j < cas[i].length; j++) {
				cas[i][j] = sa[i].charAt(j);
			}}
		
			for (int i = 0; i < cas.length; i++) {
				for (int j = 0; j < cas[i].length; j++) {
					System.out.print(cas[i][j]);
				}
				System.out.println("\n");
			}
			

			
			char[] c = new char[text.length()];
			System.out.println(c.length);
			c[0] = 'a';
			System.out.println((char)(c[0]+2));//char도 정수의 값이다.
	}
		
	static void StringstoChar() {
		boolean[] is_array = new boolean[2];
		boolean[][] is_array2 = new boolean[2][];
		is_array2[0] = new boolean[2];
		
//		System.out.println(is_array2[0][0]);
		is_test(is_array2[0]); // 2차원 배열은 array[i] 까지가 주소이다.! 중요!! 주소를 보내주는것이 중요하다!
//		System.out.println(is_array2[0][0]);
		
		int[] array_int = new int[2];
		int [][] array_int2 = new int[2][];
		array_int2[0] = new int[2];
		array_int2[1] = new int[2];
		array_int2[0] = array_int2[1];
//		System.out.println(array_int2[0]);
//		System.out.println(array_int2[1]);
		array_int2[0][0] = 300;
		int[] s = new int[1];
		s = array_int2[0];
//		System.out.println(array_int2[0]);
//		System.out.println(array_int2[1]);
//		System.out.println(s.length);
		s[0] = 800;
//		System.out.println(array_int2[1][0]);
		
		String texts = "hello;worlds;te;countss";
		String[] array_string = texts.split(";");
//		System.out.println(array_string.length);
		char[][] c_text = new char[array_string.length][];
		for (int i = 0; i < array_string.length; i++) { // 첫번째 반복문과 두번째 반복문의 목적을 꼭 생각하고 사용할 것!
			c_text[i] = new char[array_string[i].length()];
			for (int j =0; j < array_string[i].length(); j++) {
//			c_text[i] = new char[array_string[i].length()];
			c_text[i][j] = array_string[i].charAt(j);
//			System.out.print(array_string[i].charAt(j));
			}
//			System.out.println("\n");
		}
		for (int i = 0; i < c_text.length; i++) {
			for (int j = 0; j < c_text[i].length; j++) {
				System.out.print(c_text[i][j]);
			}
			System.out.println("\n");
		}
	}
	static void is_test(boolean b) {
		//value
		b = true;
	}
	
	static void is_test(boolean[] b) {
		boolean nb = true;
		b[0] = nb;
	}

	static String text;

	static String text_f() {
		return new String("helloworld");
	}

	public static String getText() {

		return text;
	}

	public static void setText(String text) {

		day_04_12.text = text;
	}

	static String text_t() {

		return text;
	}
	
	static int toString_test(int n) {

		n = 600;
		return n;
	}

	static int toString_test(int[] n) {

		n[0] = 500;
		return n[0];
	}

	static void test_array(){

		// TODO Auto-generated method stub
		int[] array = new int[3];
		int[] array_1 = new int[3];
		int[] array_2 = new int[3];

		for (int i = 0; i < array.length; i++) {
			array[i] = (i + 1) * 100;
			array_1[i] = (i + 1) * 100;
			array_2[i] = (i + 1) * 100;
		}

		int[][] array2 = new int[3][]; // int[i][] 집합을 저장할 공간이 i개라는 뜻
		array2[0] = new int[3];
		array2[1] = new int[3];
		array2[2] = new int[3];
		array2[0][0] = 100;
		array2[0][1] = 100;
		array2[0][2] = 100;
//		System.out.println(array2);

		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				array2[i][j] = ((i + 1) + j) * 100;
//				System.out.println(array2[i]);
//				System.out.println(array2[i][j]);

	}
		}
}

	static void array_test2() {

		String text = "helloworld";
		char[] cs = new char[text.length()];
		for (int i = 0; i < text.length(); i++) {
			cs[i] = text.charAt(i);
			if (text.contains("helloworl")) {
//				System.out.println("test");
			}
		}
		
//		System.out.println(cs.length);
		
		int[] a = {100, 200};
		System.out.println(a);
		toString_test(a); // 참조타입 주소를 넘겨주었다. 배열은 주소야! 같은 주소를 사용한다.  
		System.out.println("int배열 입니다:" + a[0]);
		a[0] = 100;
		toString_test(a[0]);// value 타입, 주소가 없어!
		System.out.println("인트 입니다:" + a[0]); //기본 밸류도 참조 타입이 되어 버린다.
		
		String[] t_0 = new String[1]; // 0은 크기가 아니다.
		System.out.println(t_0);
		t_0[0] = "hello";
		String[] t_1 = new String[1]; //t_0 와 t_1 주소가 다르다. 
		t_1 = t_0; //t_0 가 t_1의 주소를 사용하겠다. 
		t_1[0] = "world";
		System.out.println(t_0[0]); //완전한 참조.!! 비교연산자 사용만 참조, 다른경우엔 참조가 적용이 안된다.
	}

	static String string_text3(String[] n) {
		n[0] = "change";
		return n[0];
	}
	
	static String string_text3(String n) {
		n = "change";
		return "";
	}
	static char char_test(char[] n) { //void를 활용 할 수도 있다.
		n[0] = 'a';
		return n[0];
	}
	static char char_test(char n) {
		n = 'c';
		return n;
	}

	static void char_text() {
		int[][] array2 = new int[3][];
		array2[0] = new int[3];
		array2[1]= new int[3];
		array2[2] = new int[3];
		
		String ns[] = new String[2];
		string_text3(ns[0]); // value type
		System.out.println(ns[0]);
		
		string_text3(ns); // 참조(reference type)
		System.out.println(ns[0]);
		
//		char cs[] = new char[3];
//		char_test(cs[0]);
//		System.out.println(cs[0]);
//		
//		char_test(cs);
//		System.out.println(cs[0]);
		
		char[][] cs_2 = new char[2][];
		cs_2[0] = new char[2];
		cs_2[1] = new char[2];
		
		System.out.println("test :" + cs_2[0][0]);
		char_test(cs_2[0]);
		System.out.println(cs_2[0][0]);
	}
}

