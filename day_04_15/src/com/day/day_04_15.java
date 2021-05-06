package com.day;

import java.util.ArrayList;

import com.today.TA; //클래스 이름까지 적어줘야한다.

public class day_04_15 extends TA{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gugudan gugudan = new gugudan();
		gugudan.gugudan_method(4,5);
		System.out.println(gugudan.list.get(1).array_string[1]);
//		String text[] = {"1","3","s","e","w","e","w"};
//		Data d = new Data(text);
//		System.out.println(d.addr);
		
		
	}
	static void class_test() {

		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		ArrayList<A> list_a = new ArrayList<A>();
		
		list.clear();
		list.add(200);
		list.add(200);
		list2.add(200);
		list2.add(200);
		list.equals(list);
//		System.out.println(list.equals(list2)); // list equals object다.
//		System.out.println(list.contains(200)); //
		
//		A a = new A();
		
//		Data data = new Data("");
		
//		A ac = new A(data.text_data[0],data.text_data[1],data.text_data[2],data.text_data[3],
//				data.text_data[4],data.text_data[5],data.text_data[6]);
//		
		
//		list_a.add(ac);
//		System.out.println(list_a.get(0).id);
	}
}
