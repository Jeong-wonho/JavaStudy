package chap07;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		//DmbCellPhone ��ü ����
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���", "����",  10);
		
		//cellPhone���κ��� ��ӹ��� �ʵ�
		System.out.println("��:"  + dmbCellPhone.model);
		System.out.println("����:"  + dmbCellPhone.color);
		
		//dmbcellphone�� �ʵ�
		System.out.println("ä��:" + dmbCellPhone.channel);
		
		//CellPhone 
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������");
		dmbCellPhone.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿�ε���");
		dmbCellPhone.sendVoice("��~ �� �ݰ����ϴ�.");
		dmbCellPhone.hangUp();
		
		//dmbcellphone�� �޼ҵ� ȣ��
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}
}
