package chap09;

public class AnonymousRemoteExample {
	public static void main(String[] args) {
		AnonymousRemote anony = new AnonymousRemote();
		//익명 객체 필드 사용
		anony.field.turnOn();
		//익명 객체 로컬 변수 사용
		anony.method1();
		//익명 객체 매개값 사용
		anony.method2(
				new RemoteControl() {

					@Override
					public void turnOn() {
						// TODO Auto-generated method stub
						System.out.println("SmartTV를 켭니다.");
					}

					@Override
					public void turnOff() {
						// TODO Auto-generated method stub
						System.out.println("SmartTV를 끕니다.");
					}
				});
	}
}
