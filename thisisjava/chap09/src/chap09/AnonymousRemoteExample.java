package chap09;

public class AnonymousRemoteExample {
	public static void main(String[] args) {
		AnonymousRemote anony = new AnonymousRemote();
		//�͸� ��ü �ʵ� ���
		anony.field.turnOn();
		//�͸� ��ü ���� ���� ���
		anony.method1();
		//�͸� ��ü �Ű��� ���
		anony.method2(
				new RemoteControl() {

					@Override
					public void turnOn() {
						// TODO Auto-generated method stub
						System.out.println("SmartTV�� �մϴ�.");
					}

					@Override
					public void turnOff() {
						// TODO Auto-generated method stub
						System.out.println("SmartTV�� ���ϴ�.");
					}
				});
	}
}
