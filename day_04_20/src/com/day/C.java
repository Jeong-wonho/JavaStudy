package com.day;

import java.util.ArrayList;
import java.util.Arrays;

public class C implements I {

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
	public String[] Listinfo() {
		String s[] = new String[title.length];
		for (int i = 0; i < title.length; i++) {
			s[i] = title[i] +"/"+ director[i]+"/"+genre[i]+"/"+count[i]+"/"+actor[i]+"/"+actress[i]+"/"+time[i];
		}
		return s;
	}
	@Override
	public ArrayList<String> GetHoliList() {
		ArrayList<String> info = new ArrayList<String>();
		for (int j = 0; j < title.length; j++) {
			String k = title[j]+ director[j]+ genre[j]+ count[j]+ actor[j]+
					actress[j]+ time[j];
			info.add(k);
			} 
		return info;
	}

}
