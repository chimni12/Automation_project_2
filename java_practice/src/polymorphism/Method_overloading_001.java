package polymorphism;

public class Method_overloading_001 {
	public void b (int a ) {
		System.out.println("b() method with int data type");	
	}
	
	public void b ( float f) {
		System.out.println("b() method with float data type");
	}
	
	public void b() {
		System.out.println("b() method with no data type");
	}
	
	public void b (String s) {
		System.out.println("b() method with string data type");
	}

	public static void main(String[] args) {
		Method_overloading_001	 mo =new  Method_overloading_001();
		mo.b();
		mo.b("ab");
		mo.b(123);
		mo.b(12.0056f);
		
		
		
		
		

	}

}
