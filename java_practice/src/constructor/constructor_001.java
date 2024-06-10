package constructor;

public class constructor_001 {
	// user-defined constructor
	public constructor_001 () {
		System.out.println("user defined contructor_001");
		
		System.out.println("user defined contructor_002");
		

	}

	public static void main(String[] args) {
		constructor_001 c1=new constructor_001 ();
		constructor_001 c2=new constructor_001();
	}

}
