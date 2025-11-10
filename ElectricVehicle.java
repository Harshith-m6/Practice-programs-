package harshith.imp;

public class ElectricVehicle extends Vehicle{

	public ElectricVehicle(String name, double price, int vnum) {
		super(name, price, vnum);
	}
	
	public double rent(double distance)
	{
		double discount = 0.10;
		return getPrice()*distance*discount;
	}
	
}
