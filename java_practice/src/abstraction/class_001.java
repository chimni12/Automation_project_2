package abstraction;



public  class class_001 extends class_002 {

	@Override
	public void cd() {
		System.out.println("cd () from class_002");
		
	}

	@Override
	public void ef() {
	System.out.println("ef () from class_002");	
	}
	
	
	public static void main (String[] args) {
		class_001 c= new     class_001();
		c.cd();
		c.ef();
		c.xy();
		op();
	
	}
}
