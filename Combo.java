package harshith.imp;

public class Combo extends Meal{

	public Combo(String name, double price) {
		super(name, price);
	}

	@Override
	public double bill(int noOfPlates) {
		
		return noOfPlates*getPrice();
	}
}
