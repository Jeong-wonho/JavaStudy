package chap08;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus(); //�ڵ� Ÿ�� ��ȯ
		
		vehicle.run();
		//vehicle.checkFare(); vehicle�� �������̽����� checkFare()�� ����
		
		Bus bus = (Bus) vehicle; //���� Ÿ�� ��ȯ
		
		bus.run();
		bus.checkFare();  //bus Ŭ�������� checkFare()�� ����
		
		
		
	}
}
