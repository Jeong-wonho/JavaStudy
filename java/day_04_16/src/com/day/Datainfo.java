package com.day;

public class Datainfo implements Comparable<Datainfo> {
	public Datas d;
	
	String[] name = {"�Ѱ���", "�Ż��Ӵ�", "��﹮"};
	int[] age = {25, 36, 52};
	String[] addr = {"����", "�λ�", "����"};
	String[] cp = {"01055555555","01077777777","01065982635"};
	String[] sex = {"����", "����", "����"};
	
	public Datainfo(int index) {
		super();
		d = new Datas(name[index], age[index], addr[index], cp[index], sex[index]); 
	}

	@Override
	public int compareTo(Datainfo o) {
		return this.d.name.compareTo(o.d.name);
	}

	}

