package harshith.imp;

public abstract class Vehicle {
	//private is used encapsulation binding the fields and methods - keeping data safe - restricting the outside access 
	private String name;
	private double price;
	private int vnum;
	
	public Vehicle(String name, double price, int vnum) {
		this.name = name;
		this.price = price;
		this.vnum = vnum;
	}
	
	// abstraction hiding uncessary details hiding the implementation
	public abstract double rent(double distance);

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getVnum() {
		return vnum;
	}
	
	public void display()
	{
		System.out.println( "Vehicle [name=" + name + ", price=" + price + ", vnum=" + vnum + "]");
	}


	
	
}
