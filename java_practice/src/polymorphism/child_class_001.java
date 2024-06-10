package polymorphism;

public class child_class_001 extends parent_class_001 {
	
	public void go (String s) {
		System.out.println("s() method from child class with strings variabe is :-s");
		
	}
	public void get () {
		System.out.println(" get () method from child class");
	}
	
	

	public static void main(String[] args) {
		child_class_001 c = new child_class_001();
		//c.go (" ab");
		//c.get();
		
		// Has _a Relationship 
		parent_class_001 p= new parent_class_001();
		// p. get ();
		
		// property_03
		parent_class_001 p2 = new  child_class_001();
		p2.go("cd");
		p2. get ();
		
		
		
		
	

	}

}
