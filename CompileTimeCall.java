package harshith.imp;

public class CompileTimeCall {
	//the compiler decides which method call should be binded with which method body during the compile time is known  as the early binding
	// static methods belongs to the class instead of instances hence the binding done at the compile time
	// static methods are resolved by the reference type not object type 
	
	//the final methods implementation is fixed cannt be overrdien the compiler knows where the final method is resides and the compiler calls the particular method

	//compiler knows there is only one implementation of the final final method and it binds the particular method at the compile time
	final void show()
	{
		System.out.println("final method cant be overriden in child classes , compiler calls the excat final method version");
	}
	
	
		
	}

