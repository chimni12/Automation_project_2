package return_types;

public class class_001 {
	
	
	//3. with return statement and no parameter
	public void get () {
		System.out.println("get method no parameter");
		return;
	}
	
	//4.with return type and parameter
	public int get (int i ) {
		System.out.println("get method");
		return i;
		
	}
	public int get_data(int o) {
		System.out.println("get method");
		return 10 ;
	}
	public static String print (String name) {
		System.out.println("your name is :-"+ name);
		return name;
	}
	

	public static void main(String[] args) {
		print ("akanksha");
		
	 	
		class_001 c1 = new class_001();
		c1.get_data(9);
		c1.get(2);
		c1.get();
		
		

	}

}
