package com.day;

import java.util.ArrayList;
import java.util.Arrays;

public class A implements I {
	String[] name = {"�Ѱ���", "�Ż��Ӵ�", "��﹮"};
	String[] age = {"25", "36", "52"};
	String[] addr = {"����", "�λ�", "����"};
	String[] cp = {"01055555555","01077777777","01065982635"};
	String[] sex = {"����", "����", "����"};
	
	@Override
	public ArrayList<String> GetList() {
		ArrayList<String> names = new ArrayList<String>(Arrays.asList(name));
		return names;
	}

	@Override
	public String[] Listinfo() {
		String[] s = new String[addr.length];
		for (int i = 0; i < addr.length; i++) {
			s[i] = " �̸��� " + name[i] + " ���̴� " + age[i] + " �ּҴ� " + addr[i] + " ��ȣ�� " + cp[i] + " ���� " + sex[i];
		}
		return s;
		
	}

	@Override
	public ArrayList<String> GetHoliList() {
//		String[] k = {name[i]
		ArrayList<String> info = new ArrayList<String>();
		for (int j = 0; j < name.length; j++) {
			info.add(name[j] + age[j] + addr[j] + cp[j] + sex[j]+"\n");
			} 
		return info;
	}


	}


