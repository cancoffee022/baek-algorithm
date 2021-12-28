package book;

public class Car {
	
	String color;
	int gear;
	int speed;
	
	public String toString() {
		return "Car [color="+color+", speed="+speed+",gear=" +gear+"]";
	}
	
	void changeGear(int x) {
		gear=x;
	}
	
	void speedUp() {
		speed+=10;
	}
	
	void speedDown() {
		speed-=10;
	}

}
