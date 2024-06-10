package method_Argument;

public class class_003 {
	
	int o; 
	int h;
	
	public void x(int n) {
		o = n ;
	}
		public void y(int m) {
			h = m ;
			
		}
					
	public void print_value() {
		System.out.println("The value of Instance variable o is:-"+o);
		System.out.println("The value of instance variable h is :-"+h);
	}
	
	
	public static void main(String[] args) {
		class_003 c3 = new class_003();
		c3. x (30);
		c3. y (70);
		c3. print_value();
		
		

	}

}
