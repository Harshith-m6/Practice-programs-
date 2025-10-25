package harshith.imp;

public class StaticDemo {
	
	static int sc ;
	int nc;
	
	static {
		sc= 10;
		System.out.println(sc+"  static block only executes once when the class is loaded into jvm");
	}
	
	{
		nc=100;
		System.out.println(nc+"  non static block executes whenever the new object created");
	}
	
	static void isc()
	{
		sc+=5;
		System.out.println(sc+" increament on the static variable is done");
	}
	
	void inc(){
		nc+=50;
		System.out.println(nc+" increament on the non static variable");
	}
	
	StaticDemo(){
		System.out.println("instantiation stared");
	}
	

}
