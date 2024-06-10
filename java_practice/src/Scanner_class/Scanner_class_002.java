package Scanner_class;

import java.util.Scanner;

public class Scanner_class_002 {

	public static void main(String[] args) {

		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter yor first name");
		String first_name= sc.nextLine();
		System.out.println("enter your last name");
		String last_name= sc.nextLine();
		System.out.println("your surname is ");
		String surname= sc.nextLine();
	System.out.println("your surname is:-"+first_name+last_name);	
	}

}
