package This_keyword;

public class This_001 {
	
	String s ;
	
	public void ml(String m) {
		// this keyword 
		this .s=m;
		//System.out.println(m);
		//System.out.println(s);
		System.out.println(this .s );
	}
	
 

	public static void main(String[] args) {
		
		This_001 t = new This_001();
		t.ml("java");

		
		
		
		
	}

}
