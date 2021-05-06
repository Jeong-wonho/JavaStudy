package com.day;

import java.util.ArrayList;

public class D extends Abs{

	@Override
	public ArrayList<String> GetList() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("D_class");
		return list;
	}

	@Override
	public void getTest() {
		// TODO Auto-generated method stub
		System.out.println("test");
	}	
	
	public void list() {
		System.out.println("list");
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
