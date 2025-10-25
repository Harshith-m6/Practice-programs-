package harshith.imp;

public class CompileTimeDemo {
	
	CompileTimeDemo(){
		System.out.println("0 parameterized constructor invoked");
	}
	void show()
	{
		System.out.println("zero parameterized overrlaoding");
	}
	void show(int a)
	{
		System.out.println("int type overloading ");
	}
	void show(double d)
	{
		System.out.println("double type overloading");
	}
	
	public static void main(String[] args) {
		CompileTimeDemo cd = new CompileTimeDemo();
		cd.show();
		cd.show(10.8);
		cd.show(1);
		
		// method call is resolved at the compile time by the compiler rather by the JVM at the runtime
		
		//the compiler decides which version of the method should invoke based on the parameter is known as Overloading or early binding
	}

}
