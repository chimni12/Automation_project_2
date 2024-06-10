package Encapsulation;

public class class_001 {
	
	private int i= 10000;
	private void hidemoney(int x) {
	i=x;
	System.out.println(i);
	}

	public static void main(String[] args) {
class_001 c = new class_001();
c.hidemoney(90);
	}
 
}
