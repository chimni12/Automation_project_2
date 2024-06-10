package Scanner_class;

import java.util.Scanner;

public class scanner_class_001 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("enter 1st number");
		
		int input1 = sc.nextInt();
		System.out.println();
		int input2= sc.nextInt();
		int sum = input1 + input2;
		System.out.println("addition of above");

	}

}
