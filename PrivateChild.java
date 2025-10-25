package harshith.imp;

public class PrivateChild extends PrivateParent{
	
	 void display() {
		System.out.println("this is childs private method");
	}
	
	//calldisplay() is inherited but private display() is not inherited to the child class

}
