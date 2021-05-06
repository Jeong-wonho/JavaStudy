package com.day;

public class A implements I {

	
	String[] name = { "한경직", "신사임당", "김삼문" };
	int[] age = { 25, 36, 52 };
	String[] addr = { "서울", "부산", "대전" };
	String[] cp = { "01055555555", "01077777777", "01065982635" };
	String[] sex = { "남자", "여자", "남자" };

	public A() {
		super();
	}

	public A(int i) {
//		setName(name[i]);
//		setAge(age[i]);
//		setAddr(addr[i]);
//		setCp(cp[i]);
//		setSex(sex[i]);
//		getList();
	}
	
//	@Override
//	public int getLength() {
//		// TODO Auto-generated method stub
//		return name.length;
//	}
	public String getattr() {
		String text = "";
		for (int j = 0; j < addr.length; j++) {
			text +=	name[j] + age[j] + addr[j] + cp[j] + sex[j]+"\n";
		}
		return text;
	}
}
