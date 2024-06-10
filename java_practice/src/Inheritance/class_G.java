package Inheritance;

public class class_G extends class_F{
	public void g () {
		System.out.println("g() method from class_G");
		
	}

	public static void main(String[] args) {
		class_G g= new class_G();
		System.out.println(g.p);
		g.f();

	}

}
