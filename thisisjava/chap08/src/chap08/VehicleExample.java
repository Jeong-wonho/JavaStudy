package chap08;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus(); //자동 타입 변환
		
		vehicle.run();
		//vehicle.checkFare(); vehicle의 인터페이스에는 checkFare()가 없음
		
		Bus bus = (Bus) vehicle; //강제 타입 변환
		
		bus.run();
		bus.checkFare();  //bus 클래스에는 checkFare()가 있음
		
		
		
	}
}
