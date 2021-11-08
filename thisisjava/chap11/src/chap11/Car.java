package chap11;

public class Car {
	public String model;
	public int speed;
	
	public Car(String model) {
		this.model = model;
	}

	public Car(String model, int speed) {
		this.model = model;
		this.speed =speed;
	}
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	public String modelInfo() {
		String mInfo = model + speed;
		return mInfo;
	}
}
