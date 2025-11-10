package harshith.imp;

public class NonVeg extends Meal {

	@Override
	public double bill(int noOfPlates) {
		return noOfPlates*getPrice();
	}

	public NonVeg(String name, double price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
