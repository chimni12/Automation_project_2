package Inheritance;

public class class_I extends class_H {
	public void i () {
		System.out.println("i() method from");
	}

	public static void main(String[] args) {
		class_I i = new class_I(); 
		System.out.println(i.p);// class _F
		i.f();// class_f
		i.g();//class_G
		i.h();//claqss_H
		i.i();// class_I
		
		

	}

}
