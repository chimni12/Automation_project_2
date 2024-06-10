package Array;

public class Multi_Dimensional_Array_001 {

	public static void main(String[] args) {
		
		//10  20  30
		
		//40  50  60  
		
		//70  80  90  
		int [] [] number = new int [3][3];
		
		//insert values 
		number [0] [0] = 10;
		number [0] [1] = 20;
		number [0] [2] = 30;
		number [1] [0] = 40;
		number [1] [1] = 50;
		number [1] [2] = 60;
		number [2] [0] = 70;
		number [2] [1] = 80;
		number [2] [2] = 90;
		
		System.out.println( number [1] [2] );
		
		
		// print all values- nested loop
		for (int i=0; i<=3; i++) {
			// column increment
			for (int j=0; j<3; j++) {
				System.out.println(number [i] [j] + " ");
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
