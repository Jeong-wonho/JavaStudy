package com.day;

import java.util.ArrayList;
import java.util.Arrays;

public class Datainfo implements I, S {
	
	String[] name = {"�Ѱ���", "�Ż��Ӵ�", "��﹮"};
	int[] age = {25, 36, 52};
	String[] addr = {"����", "�λ�", "����"};
	String[] cp = {"01055555555","01077777777","01065982635"};
	String[] sex = {"����", "����", "����"};
	
	@Override
	public ArrayList<String> GetList() {
		ArrayList<String> names = new ArrayList<String>(Arrays.asList(name));
		return names;
	}

	@Override
	public String[] getString() {
		return name;
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

