package com.day;

public class info {
	int age;
	String addr;
	String cp;
	String sex;
	
//	String[] name = {"홍길동", "신사임당", "성삼문"};
//	int[] age = {30, 31, 32};
//	String[] addr = {"서울시 강남구", "서울시 강서구", "서울시 강동구"};
//	String[] phone = {"010-3333-3333", "010-8845-1548", "010-7979-7979"};
//	Stringp[] gender = {"남", "여", "남"};
	
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
		System.out.println("나이 :"+this.age);
		System.out.println("주소 :"+this.addr);
		System.out.println("연락처 :"+this.cp);
		System.out.println("자녀 수 :"+this.sex);
	}
	
}
