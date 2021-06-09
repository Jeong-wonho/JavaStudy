package com.day;

import java.util.ArrayList;

public abstract class As implements I{
	A a = null;
	String name;
	int age;
	String addr;
	String cp;
	String sex;
	
	public As(String name, int age, String addr, String cp, String sex) {
		
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.cp = cp;
		this.sex = sex;
	}

	

	public As() {
		super();
		// TODO Auto-generated constructor stub
	}



	public void setA(A a) {
		this.a = a;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public void setAddr(String addr) {
		this.addr = addr;
	}



	public void setCp(String cp) {
		this.cp = cp;
	}



	public void setSex(String sex) {
		this.sex = sex;
	}



	@Override
	public ArrayList<String> getList() {
		ArrayList<String> list = new ArrayList<String>();
		list.add(name+age+addr+cp+sex);
		return list;
	}


}
