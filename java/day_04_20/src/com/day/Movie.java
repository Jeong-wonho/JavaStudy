package com.day;

public class Movie implements Comparable<Movie>{
	
	MovieS s = null;
	String[] title = {"����", "���鷯����Ʈ", "Ÿ��Ÿ��", "�����", "Ŭ����"};
	String[] director = {"�躣��", "���ʹ���", "ī�޷�", "����ȣ", "�����"};
	String[] genre = {"�׼�", "���", "���", "������", "��ε��"};
	String[] count = {"100��", "300��", "900��", "1000��", "150��"};
	String[] actor = {"�帣��", "���ϴϽ�", "��ī������", "�۰�ȣ", "���¿�"};
	String[] actress = {"��Ż��", "������", "����Ʈ", "������", "�տ���"};
	String[] time = {"120��", "200��", "160��", "131��", "132��"};
	
	public Movie(int i) {
		s = new MovieS();
		s.setTitle(title[i]);
		s.setDirector(director[i]);
		s.setGenre(genre[i]);
		s.setCount(count[i]);
		s.setActor(actor[i]);
		s.setActress(actress[i]);
		s.setTime(time[i]);
		
		
	}
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public int compareTo(Movie o) {
		return this.s.getTitle().compareTo(o.s.getTitle()); 
	}

	
}

