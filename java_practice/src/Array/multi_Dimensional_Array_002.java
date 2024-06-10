package Array;

public class multi_Dimensional_Array_002 {

	public static void main(String[] args) {
		
		// Declare without memory Allocation-
		
		//a    b     c
		//d    e     f
		//g    h     i
		
		char [] [] singel_character = {{'a', 'b', 'c'}, {'d','e', 'f'}, {'g', 'h', 'i'}};
		
		System.out.println(singel_character [2] [2] );
		
		 for (int i = 0; i<=2; i++) {
			 for (int  j=0; j<=2; j++) {
System.out.println( singel_character [i] [j]);
			 }
			System.out.println(); 
		 }
		}

	}


