package Non_access_modifier;

public class class_001 {
	
	//static block
	
	static {
		System.out.println("static block ");
	}
	
	public void ml() {
		System.out.println("ml method ");
	}

	public static void main(String[] args) {
	class_001	 c =  new class_001();
	c.ml();

	}

}
