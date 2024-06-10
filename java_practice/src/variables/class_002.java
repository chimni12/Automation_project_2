package variables;

public class class_002 {
	
	//static variable  
	
	static String s ="Automation";
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		//directly Access variable static variable
		System.out.println(s);
		
		//Access by class name 
		System.out.println(class_002.s);
		
		//Access by class object 
		class_002 c2 = new class_002();
		System.out.println(c2.s);

	}

}
