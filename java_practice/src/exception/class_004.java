package exception;

public class class_004 {

	public static void main(String[] args) {

		
		try {
		//	statement-1
		//	statement-2
		//	statement-3
			
		} catch (Exception e) {
			try {
				Thread.sleep(2000);
				
			} catch (InterruptedException e1) {
				e1.printStackTrace();
				System.out.println("bye");
				
			}
		}
		System.out.println("hello");
	}

}
