package com.day;

import java.util.ArrayList;
import java.util.Arrays;

public class Datainfo implements I, S {
	
	String[] name = {"한경직", "신사임당", "김삼문"};
	int[] age = {25, 36, 52};
	String[] addr = {"서울", "부산", "대전"};
	String[] cp = {"01055555555","01077777777","01065982635"};
	String[] sex = {"남자", "여자", "남자"};
	
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

