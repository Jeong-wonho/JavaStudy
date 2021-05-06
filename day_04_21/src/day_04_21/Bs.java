package day_04_21;

import java.util.ArrayList;

public class Bs implements I {
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


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}
	
	@Override
	public ArrayList<String> getList() {
		ArrayList<String> list = new ArrayList<String>();
//		for (String string : a.name) {
//			list.add(string);
//		}
		
		list.add(this.getName()+this.getAddr()+this.getNumber()+this.getPhoneNum()+this.getEmail()+this.getService()+this.getPlan()+
				this.getSerial());
		
		return list;
	}
}
