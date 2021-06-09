package com.day;

import java.util.ArrayList;

public abstract class Bs implements I{
	B b = null;
	String name;
	String addr;
	String number;
	String phoneNum;
	String email;
	String service;
	String plan;
	String serial;
	
	public Bs(String name, String addr, String number, String phoneNum, String email, String service, String plan,
			String serial) {
		
		this.name = name;
		this.addr = addr;
		this.number = number;
		this.phoneNum = phoneNum;
		this.email = email;
		this.service = service;
		this.plan = plan;
		this.serial = serial;
	}
	

	public Bs() {
		
		// TODO Auto-generated constructor stub
	}


	public void setB(B b) {
		this.b = b;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setAddr(String addr) {
		this.addr = addr;
	}


	public void setNumber(String number) {
		this.number = number;
	}


	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public void setService(String service) {
		this.service = service;
	}


	public void setPlan(String plan) {
		this.plan = plan;
	}


	public void setSerial(String serial) {
		this.serial = serial;
	}


	
	
	@Override
	public ArrayList<String> getList() {
		ArrayList<String> list = new ArrayList<String>();		
		list.add(name+addr+number+phoneNum+email+service+plan+
				serial);
		return list;
	}
}
