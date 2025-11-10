package harshith.imp;
import java.util.*;
public class MainMeal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Meal m1 = new VegMeal("butter naan", 123);
		Meal m2 = new NonVeg("Mutton chops",345);
		Meal m3 = new Combo("biryani kurma",250);
		
		System.out.println("Enter plates");
		int n = sc.nextInt();
		System.out.println(m1.bill(n));
		m1.display();
		System.out.println(m2.bill(n));
		m2.display();
		System.out.println(m3.bill(n));
		m3.display();
	}

}
