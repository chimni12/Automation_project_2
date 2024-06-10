package Inheritance;

public class class_H extends class_G {
	public void h() {
		System.out.println("h() method from class_H");
	}

	public static void main(String[] args) {
		class_H h = new class_H();
		System.out.println(h.p);// class_f
		h.f();//class_f
		h.g();//class_g

	}

}
