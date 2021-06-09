package com.day;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;


public class day_04_16 {
	
	// key 값 이름 class 나이,주소, 핸드폰번호, 성별
	public static void main(String[] args) {
		HashMap<String, Datainfo> info_map = new HashMap<String, Datainfo>();
		ArrayList<Datainfo> list_array = new ArrayList<Datainfo>();
//		ArrayList<String> list_string = new ArrayList<String>();
		
		for (int i = 0; i < 3; i++) {
			Datainfo info = new Datainfo(i);
			info_map.put(info.d.name, info);
//			System.out.println(info.d.name);
			list_array.add(info);
		}

		Collections.sort(list_array);
//		System.out.println(list_array.size());
		for (int i = 0; i < list_array.size(); i++) {
			System.out.println(list_array.get(i).d.name);
		}
	}
	static void hash_map_practice() {
		HashMap<String, info> info_map = new HashMap<String, info>();
		info_map.put("김시습", new info(25, "서울", "01055555555", "남자"));
		info_map.put("홍길동", new info(36, "부산", "01077777777", "여자"));
		info_map.put("성삼문", new info(52, "대전", "01065982356", "남자"));
		
		for (String string : info_map.keySet()) {
//			System.out.println(string);
			System.out.println(info_map.get(string).getAge());
			info_map.get("홍길동").peopleinfo();
		}
		System.out.println(info_map.keySet());
		}
	static void map_hash() {
		HashMap<A, A> map_a = new HashMap<A, A>();
		A a = new A();
		A b = new A();
		A c = new A();
		map_a.put(a, new A(100, "apple"));
		map_a.put(b, new A(200, "google"));
		map_a.put(c, new A(300, "samsung"));
		
	//	System.out.println(map_a.keySet());
	//	System.out.println(map_a.size());
	//	System.out.println(map_a.values());
		for (A string : map_a.keySet()) {
	//		System.out.println(string);
			System.out.println(map_a.get(string).str);
			System.out.println(map_a.get(string).count);
			
		}
	}
	static void set_tree2() {


//		HashSet<Integer> set = new HashSet<Integer>();
//		
//		TreeSet<A> set = new TreeSet<A>((x,y) -> {
//			return x.count - y.count; //labmda 식
//		});
//		set.add(200);
//		set.add(100);
//		set.add(400);
//		for (Integer integer : set) {
//			System.out.println(integer);
//		}
//		
//		TreeSet<String> tree_string = new TreeSet<String>();
//		HashSet<A> a = new HashSet<A>();
		ArrayList<A> list = new ArrayList<A>();
//		TreeSet<A> at = new TreeSet<A>();
		
//		A a1 = new A();
//		a1.count = 100;
//		a1.str = "aa";
//		list.add(a1);
//		
//		A a2 = new A();
//		a2.count = 50;
//		a2.str = "ee";
//		list.add(a2);
//		
//		A a3 = new A();
//		a3.count = 200;
//		a3.str = "cc";
//		list.add(a3); // A()클래스의 인스턴스
		
//		for (A item : a) {
//			System.out.println(item.count);
//		}
		
//		list.add(a1);
//		list.add(a2);
//		list.add(a3);
////		System.out.println(list.size());
		Collections.sort(list);
		for (A a : list) {
			System.out.println(a.count);
		}

		
//		
//		for (A i : at) {
//			System.out.println(i.count);
//		}
		//treeset은 자동 정렬이 있구나.!
//		tree_string.add("cccc");
//		tree_string.add("aaa");
		
		
//		String s = "cccc"; 
//		String s2 = "aaa";
//		String s3 = "dddd";

//		A a4 = new A();
//		a4.str = s2;
//		at.add(a4); // A()클래스의 인스턴스
//		A a5 = new A();
//		a5.str = s3;
//		at.add(a5);
//		for (A i : at) {
//			System.out.println(i.str);
//		}
		
//		a3.count = 
//		tree_string.add("eeee");
//		tree_string.add("bbb");
//		a.add(new A());
//		a.add(new A());
//		A aa = new A();
		
		
		
		
//		System.out.println(aa);
//		System.out.println(a.size());
		
//		for (A item : a) {
//			System.out.println(item.count); 
//		}
		
	}
	static void set_test() {

		
		HashSet<Integer> set_list = new HashSet<Integer>();
		TreeSet<Integer> tree_set = new TreeSet<Integer>();
		
		set_list.add(100);
		set_list.add(200);
		set_list.add(300);
		set_list.add(400);
		
//		System.out.println(set_list.size());
//		for (int item: set_list) {
//			System.out.println(item);
//		}
		tree_set.add(100);
		tree_set.add(200);
		tree_set.add(300);
		tree_set.add(400);
		tree_set.add(500);
		
		for (int tree: tree_set) {
			System.out.println(tree);
		}
	}
	static void set_tree() {}
	static void map_test() {
		HashMap<Integer, A> map_a = new HashMap<Integer, A>();
		TreeSet<A> tree_set = new TreeSet<A>();
		ArrayList<A> list = new ArrayList<A>();
		
		
		A a = new A();
		a.count = 3000;
		a.str = "다";
		A b = new A();
		b.count = 2000;
		b.str = "가";
		A c = new A();
		c.count = 500;
		c.str = "나";
		
		list.add(a);
		list.add(b);
		list.add(c);
//		
//		Collections.sort(list);
//		for (int i = 0; i < list.size(); i++) {
//			 System.out.println(list.get(i).str);	
//		};
		
		

		
		////		map에 값 추가
//		map.put(11,  100);
//		map.put(12,  200);
//		map.put(13,  300);
////		map.get(1);
//		
////		System.out.println(map.get(12));
////		System.out.println(map.keySet());
//		
//		for (Integer key : map.keySet()) {
//			System.out.println(key); 
//			System.out.println(map.get(key));
//		}
//		System.out.println(map.values());
	}
}
