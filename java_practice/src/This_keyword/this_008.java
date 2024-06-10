package This_keyword;

public class this_008 {
	
	public this_008() {
		
		System.out.println("constructor with no argument");	
	}
 
	public  this_008(int i ) {
		this();
		System.out.println("constructor with one argument")	;
	}
	
	public this_008(float f ,long l) {
		this(3);
		System.out.println("constructor with two argument");
	}
	public this_008(String s, int a , int w) {
		this(50.90f,4000);
		System.out.println("constructor with three argument");	
	}
	public this_008(double d,float h , int p,int s) {
		this("ab",900,1000);
		System.out.println("constructor with four argument");
	}
	
	public static void main(String[] args) {
		this_008 t8 = new this_008( 60.90,390.99f,100,5);
		
	
	
		
	}

}
