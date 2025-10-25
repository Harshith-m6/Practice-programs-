package harshith.imp;

public class MainStaticDemo {
	public static void main(String[] args) {
		StaticDemo sd = new StaticDemo();
		//inreamenting the static variable using the static method
		StaticDemo.isc();
		StaticDemo.isc();
		
		//incrementing non static variable using instance method
		sd.inc();
		sd.inc();
		StaticDemo sd1 = new StaticDemo();
		sd1.inc();
	}

}
