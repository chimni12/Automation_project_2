package polymorphism;

public class method_overloding_002 {
	
	//public static void a (int i) {
	//	System.out.println("a ()method with int Argument");
	//}
	
	// public static void a (float f) {
	//	 System.out.println("a ()method with float Argument");
	//
	// }

	  public  static void a (double d) {
		  System.out.println("a ()method with double Argument");
	  }
	  public  static void a (long l) {
		  System.out.println("a ()method with long  argument");
	  }
	  public static void  a () {
		System.out.println("a()method with no Argument");  
	  }

	public static void main(String[] args) {
		a ();
		a (12);

	}

}
