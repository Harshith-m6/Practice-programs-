package harshith.imp;

public class AllBlocks {
	
	static int a ;
	int b;
	static {
		a =10;
		System.out.println("static block loaded initializes the static variable");
	}
	
	{
		b = 20;
		System.out.println("non static variable is initialized through instance block");
	}
	
	AllBlocks()
	{
		System.out.println("constructor is invoked");
	}
	void add()
	{
		int c = a+b;
		System.out.println("after class load and instantiation :"+c+" is the valuee of sum of both static and non static varibales");
	}
	
	public static void main(String[] args) {
		AllBlocks ab = new AllBlocks();
		ab.add();
	}

}
