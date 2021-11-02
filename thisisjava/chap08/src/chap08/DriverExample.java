package chap08;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);  // vehicle 로 자동타입변환(자식->부모)
		driver.drive(taxi);
	}
}
