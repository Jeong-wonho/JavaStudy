package chap08;

public class Driver {
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) { //vehicel �Ű� ������ �����ϴ� ��ü�� Bus���� ����
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}
}
