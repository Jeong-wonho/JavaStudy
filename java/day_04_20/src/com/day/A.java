package com.day;

import java.util.ArrayList;
import java.util.Arrays;

public class A implements I {
	String[] name = {"한경직", "신사임당", "김삼문"};
	String[] age = {"25", "36", "52"};
	String[] addr = {"서울", "부산", "대전"};
	String[] cp = {"01055555555","01077777777","01065982635"};
	String[] sex = {"남자", "여자", "남자"};
	
	@Override
	public ArrayList<String> GetList() {
		ArrayList<String> names = new ArrayList<String>(Arrays.asList(name));
		return names;
	}

	@Override
	public String[] Listinfo() {
		String[] s = new String[addr.length];
		for (int i = 0; i < addr.length; i++) {
			s[i] = " 이름은 " + name[i] + " 나이는 " + age[i] + " 주소는 " + addr[i] + " 번호는 " + cp[i] + " 성별 " + sex[i];
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


