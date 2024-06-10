package Inheritance;

public class Class_B  extends class_A{
	double d =60.45;
	int i = 9000;
	
	static long l =80000;
	
	public void b() {
		System.out.println("b method");
		
	}

	public static void main(String[] args) {
		Class_B cb = new Class_B();
		System.out.println(cb.i);//class_A
		cb.get_data(); // class_A
		System.out.println(cb.d);//class_b
		cb.b(); // class_B
		System.out.println(cb.i);
		
		System.out.println(l);

	}

}