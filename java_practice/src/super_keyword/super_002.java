package super_keyword;

public class super_002 extends super_001 {
	public double d = 2.001;
	
	//super keyword
	public void get_variable() {
		//variable from parent class
		System.out.println(super.f);
		
	}
	

	public static void main(String[] args) {
		super_002 s = new  super_002();
		s.get_variable();
	}

}
