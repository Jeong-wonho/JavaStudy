package com.day;

import java.util.ArrayList;
import java.util.Arrays;

public class Movie2 implements I, S {
	String[] title = {"����", "���鷯����Ʈ", "Ÿ��Ÿ��", "�����", "Ŭ����"};
	String[] director = {"�躣��", "���ʹ���", "ī�޷�", "����ȣ", "�����"};
	String[] genre = {"�׼�", "���", "���", "������", "��ε��"};
	String[] count = {"100��", "300��", "900��", "1000��", "150��"};
	String[] actor = {"�帣��", "���ϴϽ�", "��ī������", "�۰�ȣ", "���¿�"};
	String[] actress = {"��Ż��", "������", "����Ʈ", "������", "�տ���"};
	String[] time = {"120��", "200��", "160��", "131��", "132��"};
	@Override
	
	public ArrayList<String> GetList() {
		ArrayList<String> titles = new ArrayList<String>(Arrays.asList(title));
		return titles;
	}
	@Override
	public String[] getString() {
		// TODO Auto-generated method stub
		return title;
	}
	@Override
	public String[] Listinfo() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ArrayList<String> GetHoliList() {
		// TODO Auto-generated method stub
		return null;
	}
}
