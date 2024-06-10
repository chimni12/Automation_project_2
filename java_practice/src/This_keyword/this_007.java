package This_keyword;

public class this_007 {
	
	
	public this_007() {
		System.out.println("constructor with no argument");
		
	}
	
	public this_007(String s) {
		this();
		System.out.println("constructor with one argument");
	}

	public static void main(String[] args) {
		this_007 tl= new this_007("ab");	

	}

}
