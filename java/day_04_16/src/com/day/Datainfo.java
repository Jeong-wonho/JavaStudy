package com.day;

public class Datainfo implements Comparable<Datainfo> {
	public Datas d;
	
	String[] name = {"한경직", "신사임당", "김삼문"};
	int[] age = {25, 36, 52};
	String[] addr = {"서울", "부산", "대전"};
	String[] cp = {"01055555555","01077777777","01065982635"};
	String[] sex = {"남자", "여자", "남자"};
	
	public Datainfo(int index) {
		super();
		d = new Datas(name[index], age[index], addr[index], cp[index], sex[index]); 
	}

	@Override
	public int compareTo(Datainfo o) {
		return this.d.name.compareTo(o.d.name);
	}

	}

