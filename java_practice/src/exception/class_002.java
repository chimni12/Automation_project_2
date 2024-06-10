package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class class_002 {
	
	public void java() {
		
		try {
		FileInputStream fis = new	FileInputStream("ab");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

	}

}
