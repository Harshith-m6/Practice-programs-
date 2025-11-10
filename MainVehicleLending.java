package harshith.imp;
import java.util.*;
public class MainVehicleLending {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vehicle v1 = new Car("Swift",15.0 , 123);
		Vehicle v2 = new Bike("Splendor", 8.00 , 345);
		Vehicle v3 = new ElectricVehicle("Ola", 5.00,789);
		
		System.out.println("rent for 10kms distance");
		double distance = 10.00;
		
		System.out.println("rent by vehicle");
		v1.display();
		System.out.println(v1.rent(distance));
		
		v2.display();
		System.out.println(	v2.rent(distance));
		
		v3.display();
		System.out.println(v3.rent(distance));
		
	}

}
