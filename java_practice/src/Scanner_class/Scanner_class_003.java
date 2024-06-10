package Scanner_class;

import java.util.Scanner;

public class Scanner_class_003 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("enter any one number ");

		
		int input = sc.nextInt();
		System.out.println("table multiplication ");
		
		for (int i=1; i<=10; i++) {
			//System.out.println(1 *input);
			//1*1=1
			System.out.println(input+"x"+i+"="+(i*input));
			
		}
		
		
	}

}
