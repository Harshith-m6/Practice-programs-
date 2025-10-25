package harshith.imp;

public class StaticBlock {
	
	static
	{
		// executes when the class is loaded into the memory
		//executes before the execution of the main method
		System.out.println("static block  executed");
	}
	static {
		System.out.println("second static block");
	}
	public static void main(String[] args) {
		System.out.println("Main method executed");
	}

}
