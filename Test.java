package harshith.imp;

public class Test {
	public static void main(String[] args) {
		A a = new A();
		a.m();
		B b = new B();
		b.m();
		
		//this is called method hiding not method overriding , the static methods are called using the type of the class 
		//here compiler finds the type of the object b is B and calls the static method present in the B
	}

}
