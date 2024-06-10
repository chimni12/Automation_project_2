package java_decision_statment;

public class Else_if_ladder {

	public static void main(String[] args) {
		
		// deted-21- 03-2024
		
		int i = 90;
		if (i>100) {
			System.out.println("condition - 1");
		}else if (i<80 && i>60) {
			System.out.println("condition-2");
		}else if (i!=90) {
			System.out.println("condition-3");
			
		}else if (i<5) {
			System.out.println("condition-4");
		}
		else {
			System.out.println("All condition is false");
		}

	}

}
