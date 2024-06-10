package loop;

public class Inverted_half_pyramid_rotate_180 {

	public static void main(String[] args) {
		//Inverted half pyramid rotate 180
		//             *
		//           * *
		//         * * *
		//       * * * *
		for(int i =1;i<=4;i++) {
			
			//print spaces
			for(int j=1;j<=4-1;j++) {
				System.out.println(" ");
			}
			// To ptint
			for(int y=1;y<=i;y++) {
				System.out.println("*");
				
			}
			System.out.println();
		}

	}

}
