package com.day;

public class A {
	//Ŀ���һ����ڰ� ������ �ڵ����� �����ڸ� ������� �� ����. �ڡ�
	
	String id;
	String name;
	String addr;
	String phone;
	String gender;
	String age;
	String number;

	//���� ������ ����Ҷ� �����ϱ� ���ؼ� this�� ��� (�ڱ� �ڽ��� ���� ���������� ���� �Ҷ� this�� ����ϴµ� �Ű������� �̸��� ���� ��� this�� ����Ѵ�.
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
