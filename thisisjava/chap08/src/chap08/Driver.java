package chap08;

public class Driver {
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) { //vehicel 매개 변수가 참조하는 객체가 Bus인지 조사
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}
}
