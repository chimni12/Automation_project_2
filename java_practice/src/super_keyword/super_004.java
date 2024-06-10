package super_keyword;

public class super_004 extends super_003  {
	
	public void paper() {
		//super.scale();// super_003
		System.out.println("paper method from super_004");
		super. scale();// super_003
	}

	public static void main(String[] args) {
		super_004 s4 = new super_004();
		s4.paper();

	}

}
