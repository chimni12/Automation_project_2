package variables;

public class class_004 {
	
	// Instance variable 
	byte b = 100;
	
	// static variable 
	static int i = 2000;
	
	// instance method  
	public void print(){
		System.out.println(b);
		System.out.println(i);
		
		
	}
		
	// static method 
	public static void print_variable() {
				//Access static variable 
		System.out.println(i);
		
		
	}

	public static void main(String[] args) {
		//Access static method directly
		print_variable();
		//Access Instance variable 
				class_004 c4 = new class_004();
				System.out.println(c4.b);

		
	}

}
