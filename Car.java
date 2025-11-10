package harshith.imp;

public class Car extends Vehicle {

	public Car(String name, double price, int vnum) {
		super(name, price, vnum);
	}
	
	@Override
	public double rent(double distance) {
		double basePrice = 50.0;
		return basePrice + (getPrice() * distance);
	}
	
	

}
