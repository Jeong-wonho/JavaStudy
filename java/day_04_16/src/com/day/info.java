package com.day;

public class info {
	int age;
	String addr;
	String cp;
	String sex;
	
//	String[] name = {"ȫ�浿", "�Ż��Ӵ�", "���﹮"};
//	int[] age = {30, 31, 32};
//	String[] addr = {"����� ������", "����� ������", "����� ������"};
//	String[] phone = {"010-3333-3333", "010-8845-1548", "010-7979-7979"};
//	Stringp[] gender = {"��", "��", "��"};
	
	public info(int age, String addr, String cp, String sex) {
		this.age = age;
		this.addr = addr;
		this.cp = cp;
		this.sex = sex;
	}
	public int getAge() {
		return this.age;
	}
	public String getCp() {
		return this.cp;
	}
	public String getAddr() {
		return this.addr;
	}
	public String getSex() {
		return this.sex;
	}
	public void	peopleinfo() {
		System.out.println("���� :"+this.age);
		System.out.println("�ּ� :"+this.addr);
		System.out.println("����ó :"+this.cp);
		System.out.println("�ڳ� �� :"+this.sex);
	}
	
}
