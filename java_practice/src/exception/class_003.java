package exception;

public class class_003 {
	
	public void a()throws InterruptedException{
		Thread.sleep(5000);
	}

	public static void main(String[] args) throws InterruptedException {
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			
		e.printStackTrace();	
		}
		
		Thread.sleep(3000);
		Thread.sleep(3000);
		
		
		Thread.sleep(3000);
		
		
		Thread.sleep(3000);
		Thread.sleep(3000);
		
		
		Thread.sleep(3000);
		Thread.sleep(3000);
		Thread.sleep(3000);
		Thread.sleep(3000);
		Thread.sleep(3000);
		Thread.sleep(3000);
	}

}
