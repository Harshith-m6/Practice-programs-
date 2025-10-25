package harshith.imp;

public class MainPrivate {
	public static void main(String[] args) {
		PrivateParent pp = new PrivateParent();
		pp.callDisplay();
		
		PrivateChild pd = new PrivateChild();
		pd.callDisplay();
		
		PrivateParent p = new PrivateChild(); //upcasting
		p.callDisplay();
		
		//since child private display() is not visible to the callDisplay() to callDisplay() binds the method call to private diaplay() of parent class
		//callDisplay() binds with private display() during the compile time  
	}

}
