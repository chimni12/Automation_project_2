package String_class;

public class String_class_005 {

	public static void main(String[] args) {

		
		String s = "prnt character";
		String [] op = s.split("");
		
		
		System.out.println(op[0]);
		System.out.println(op[1]);
		
		String r = "to print character of String revers direction ";
		String []xy=r.split("");
		
		//System.out.println(xy[0]);
		//System.out.println(xy[1]);
		//System.out.println(xy[2]);
		//System.out.println(xy[3]);
		//System.out.println(xy[4]);
	//	System.out.println(xy[5]);
		//System.out.println(xy[6]);
	//	System.out.println(xy[7]); 
		
		String w = "to check ending character of String";
		String[] ab= w.split("-");
		
		// for each loop 
		for (String cd:ab) {
			System.out.println(cd);
			
			//for loop
			for (int i = 0; i<ab.length; i++) {
				System.out.println(ab[i]);
			}
			
		}
		
		
		
		
		
	}

}
