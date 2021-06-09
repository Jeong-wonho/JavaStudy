package day_04_21;

import java.util.ArrayList;

public class As implements I {
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
//		System.out.println("as default");
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public ArrayList<String> getList() {
		ArrayList<String> list = new ArrayList<String>();
//		for (String string : a.name) {
//			list.add(string);
//		}
		
		list.add(this.getName()+this.getAge()+this.getAddr()+this.getCp()+this.getSex());
		
		return list;
	}
		

}
