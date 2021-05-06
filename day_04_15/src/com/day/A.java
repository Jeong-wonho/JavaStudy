package com.day;

public class A {
	//커스텀생성자가 있으면 자동으로 생성자를 만들어줄 수 없다. ★★
	
	String id;
	String name;
	String addr;
	String phone;
	String gender;
	String age;
	String number;

	//같은 변수를 사용할때 구별하기 위해서 this를 사용 (자기 자신이 가진 전역변수에 접근 할때 this를 사용하는데 매개변수가 이름이 같을 경우 this를 상요한다.
	public A(String id, String name, String addr, String phone, String gender, String age, String number) {
		super();
		this.id = id;
		this.name = name;
		this.addr = addr;
		this.phone = phone;
		this.gender = gender;
		this.age = age;
		this.number = number;
	}

}
