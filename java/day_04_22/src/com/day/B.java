package com.day;

public class B extends Bs {
	
	Bs bs = null;
	String[] name = { "�۰���", "����", "�����", "������", "���缮" };
	String[] addr = { "��⵵ ������", "���� Ư����", "�λ� ������", "��õ ������", "���� ������" };
	String[] number = { "000000-123456", "000000-123456", "000000-123456", "000000-123456", "000000-123456" };
	String[] phoneNum = { "010-0000-1234", "010-0000-1234", "010-0000-1234", "010-0000-1234", "010-0000-1234", };
	String[] email = { "kosta@kosta.kr", "kosta@kosta.kr", "kosta@kosta.kr", "kosta@kosta.kr", "kosta@kosta.kr", };
	String[] service = { "SK-0000-1234", "KT-0000-1234", "LG-0000-1234", "SK-0000-1234", "������-0000-1234" };
	String[] plan = { "20000", "30000", "50000", "60000", "70000", };
	String[] serial = { "����ȣ_0000", "����ȣ_0000", "����ȣ_0000", "����ȣ_0000", "����ȣ_0000" };
	
	
	public B() {
		
	}


	public B(int i) {
		setName(name[i]);
		setAddr(addr[i]);
		setNumber(number[i]);
		setPhoneNum(phoneNum[i]);
		setEmail(email[i]);
		setService(service[i]);
		setPlan(plan[i]);
		setSerial(serial[i]);
		getList();
	}


	@Override
	public int getLength() {
		return name.length;
	}
}
