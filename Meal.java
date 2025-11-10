package harshith.imp;

public abstract class Meal {
	
	private String name ;
	private double price;
	
	
	
	public Meal(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}

	public  void display()
	{
		System.out.println( "Meal [name=" + name + ", price=" + price + "]");
	}
	
	public abstract double bill(int noOfPlates);
}
