package day_04_21;

import java.util.ArrayList;

public class day_04_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<I> list = new ArrayList<I>();
		
		A a1 = new A();
		for (int i = 0; i < a1.name.length; i++) {
			A a = new A(i);
			
			list.add(a);
			System.out.println(list.get(i).getList());
		}
		System.out.println("=====");
		B b1 = new B();
		for (int i = 0; i < b1.name.length; i++) {
			B b = new B(i);
			
			list.add(b);
			System.out.println(list.get(i).getList());
		}
		System.out.println("=====");
		C c1 = new C();
		for (int i = 0; i < c1.title.length; i++) {
			C c = new C(i);
			
			list.add(c);
			System.out.println(list.get(i).getList());
		}
		
		

		
		
		/*
		ArrayList<A> list_a = new ArrayList<A>();
		for (int i = 0; i < 3; i++) {
			A a = new A(i);
			list_a.add(a);
		}
//		System.out.println(list_a.get(0).as.getList().size());
		
		ArrayList<B> list_b = new ArrayList<B>();
		for (int j = 0; j < 5; j++) {
			B b = new B(j);
			list_b.add(b);
		}
//		System.out.println(list_b.get(0).bs.getList().get(0));
	
	
		ArrayList<C> list_c = new ArrayList<C>();
		for (int j = 0; j < 5; j++) {
			C c = new C(j);
			list_c.add(c);
		}
		System.out.println(list_c.get(0).cs.getList().get(0));
		*/
		
	
	}
}
