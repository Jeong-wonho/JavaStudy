package com.day;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class day_04_20 {

	public static void main(String[] args) {
		
		ArrayList<I> list = new ArrayList<I>();
//		LinkedList<I> linked = new LinkedList<I>();
				
		A a = new A();
		B b = new B();
		C c = new C();
		
		list.add(a);
		list.add(b);
		list.add(c);
		
		System.out.println(list.get(0).Listinfo()[1]);
		
		
//		linked.add(a);
//		linked.add(b);
//		linked.add(c);
//		
//		print_test(a);
//		print_test(b);
//		print_test(c);
		
		//수평 출력
	}
	static void map_test2() {


//		I a = new A();
//		I b = new B(); // Interface에서 생성한 함수만 사용할 수 있다

		ArrayList<I> list = new ArrayList<I>();
		LinkedList<I> linked = new LinkedList<I>();
//		ArrayList<S> list2 = new ArrayList<S>();
//		ArrayList<String> list2 = new ArrayList<String>();

		Movie2 movie = new Movie2();
		Datainfo data = new Datainfo(); // 인터페이스도 구현하고 B 안에 있는 함수도 구현하겠다.
		PhoneData phone = new PhoneData();
		// 다형성
		D d = new D();
		d.test();
		d.GetList();
		d.list();
				
//		list.add(movie);
//		list.add(data);
//		list.add(phone);
		list.add(d);
		
		linked.add(movie);
		linked.add(data);
		linked.add(phone);
//		Collections.sort(list.get(0).getString());

//		for (int i = 0; i <list.size(); i++) {
//			System.out.println(list.get(i).GetList().size());
//			for (int j = 0; j < list.get(i).GetList().size(); j++) {
//				System.out.println(list.get(i).GetList().get(j));
//			}
//			System.out.println("-------------");
//			System.out.println(a.GetList().get(i));
//			System.out.println(b.GetList().get(i));
//		}

//		a.test();
//		b.test();
		print_test2(list);
		
		
	}
	static void print_test(I a) {


		for (int i = 0; i < a.GetList().size(); i++) {
//			System.out.println(a.GetList().get(i));
			System.out.println(a.Listinfo());
	}
	}
	static void print_test2(List<I> list) {
		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i).GetList().size());
			for (int j = 0; j < list.get(i).GetList().size(); j++) {
				System.out.println(list.get(i).GetList().get(j));
			}
		}
	}
	static void map_test() {
		HashMap<String, Movie> map = new HashMap<String, Movie>();
		ArrayList<Movie> list_movie = new ArrayList<Movie>();

		for (int i = 0; i < 5; i++) {
			Movie movie = new Movie(i);
			map.put(movie.s.getTitle(), movie);
			list_movie.add(movie);
//			System.out.println(movie.s.getTitle());
		}
		ArrayList<String> list = new ArrayList<String>(map.keySet());
//		list.addAll(map.keySet())

		System.out.println(list.size());
//		Collections.sort(list);
		Collections.sort(list_movie);

		for (String string : list) {
			System.out.println(string);
		}

		for (int i = 0; i < list_movie.size(); i++) {
			System.out.println(list_movie.get(i).s.getTitle());
		}
	}
}
