package harshith.imp;

public class NonStaticBlocks {
	{
		System.out.println("its a non static block it executes for each new object created");
	}
	NonStaticBlocks()
	{
		System.out.println("its a constructor block executes when the constructor is invoked");
	}
	void display()
	{
		System.out.println("instance member");
	}
	
	public static void main(String[] args) {
		
		NonStaticBlocks n = new NonStaticBlocks();
		n.display();
		NonStaticBlocks n1 = new NonStaticBlocks();
		
		
	}

}
