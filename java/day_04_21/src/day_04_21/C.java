package day_04_21;

public class C extends Cs{
	
	Cs cs = null;
	String[] title = {"����", "���鷯����Ʈ", "Ÿ��Ÿ��", "�����", "Ŭ����"};
	String[] director = {"�躣��", "���ʹ���", "ī�޷�", "����ȣ", "�����"};
	String[] genre = {"�׼�", "���", "���", "������", "��ε��"};
	String[] count = {"100��", "300��", "900��", "1000��", "150��"};
	String[] actor = {"�帣��", "���ϴϽ�", "��ī������", "�۰�ȣ", "���¿�"};
	String[] actress = {"��Ż��", "������", "����Ʈ", "������", "�տ���"};
	String[] time = {"120��", "200��", "160��", "131��", "132��"};

	public C() {
		
	}


	public C(int i) {
		
		setTitle(title[i]);
		setDirector(director[i]);
		setGenre(genre[i]);
		setCount(count[i]);
		setActor(actor[i]);
		setActress(actress[i]);
		setTime(time[i]);
		getList();
	}
}
