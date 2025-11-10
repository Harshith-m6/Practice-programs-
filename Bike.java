package harshith.imp;

public class Bike extends Vehicle{

	public Bike(String name, double price, int vnum) {
		super(name, price, vnum);
	}
	

	public double rent(double distance)
	{
		return getPrice()*distance;
	}
}
