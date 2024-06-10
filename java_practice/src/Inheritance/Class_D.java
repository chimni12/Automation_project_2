package Inheritance;

import method.class_1;

public class Class_D extends Class_c  {
	public void y() {
		System.out.println("y method");
		
	}

	public static void main(String[] args) {
//Has_A Relationship
		Class_c c= new Class_c();
		c.go();
		c.print();
		
		// parent class ref variable hold child class
		Class_c c1=new Class_D();
		c1.print();
		go();
		
		// property _ 4
		//Class_D c2 =new Class_c();
		
		
		
		
		
		
		
		
		
	}

}
