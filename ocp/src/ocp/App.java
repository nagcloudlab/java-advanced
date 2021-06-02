package ocp;

interface Wheel {
	int rotate(int speed);
}

class MRFWheel implements Wheel {
	public MRFWheel() {
		System.out.println("MRFWheel instance created...");
	}

	public int rotate(int speed) {
		System.out.println("MRF wheel rotating..");
		return 100;
	}
}

class CEATWheel implements Wheel {
	public int rotate(int speen) {
		System.out.println("CEAT wheel rounding..");
		return 150;
	}
}

class Car {

	Wheel wheel;

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public void move() {
		wheel.rotate(10);
		System.out.println("car moving...");
	}
}

public class App {

	public static void main(String[] args) {

		Car car = new Car();
		car.setWheel(new MRFWheel());
		
		car.move();
		car.move();
		
		car.setWheel(new CEATWheel());
		
		car.move();
		car.move();
		

	}

}
