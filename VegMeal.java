package harshith.imp;
import java.util.*;
public class VegMeal extends Meal {

	Scanner sc = new Scanner(System.in);
	public VegMeal(String name, double price) {
		super(name, price);
		
	}

	@Override
	public double bill(int veg) {	
		return veg*getPrice();
	}
	
	

}
