package String_class;

import operators.class_003;

public class String_class_004 {
	
	String s = "nagpur";
	String r = "wardha";
	String p = "warora";
	String a = "";
	
	
	public static String t = "chandrapur";
	static String m= "given";
	String v = "ab";
	String x = "cd";
	
	public void get_String () {
		// to add another String in given string
		System.out.println(s.concat("is orange city"));
		System.out.println(s+"is big city");
		// to make string in lower case
		System.out.println(r.toLowerCase());
		System.out.println(p.toUpperCase());
		
		//to remove beginning and ending space from string
		System.out.println(t.trim());
		System.out.println("cd");
		
		// to check string empty or not
		System.out.println(a. isEmpty());
		
		// to check characters with is present or not
		
		System.out.println(m.contains("gv"));// false
		System.out.println(m.contains("gi"));// true
		// to compare two string which is equal or not
		
		System.out.println(v.equals("ab"));
		
		// to ignore case b/t two string
		String  ab = "TRAIN";
		String  xy = "train";
		System.out.println(ab.equalsIgnoreCase(xy));
		System.out.println(ab.equalsIgnoreCase(ab));
		
		//to check ending characters of string 
		String op = "sunday";
		System.out.println(op.endsWith("ay") );
		
		// to print characters in forwards directions
		String m = "you will do great";
		for (int  x = 0; x<m.length();x++) {
			System.out.println(m.charAt(x)+" ");
		}
		
		for (int y=m.length()-1; y>0; y--) {
			System.out.println(m.charAt(y)+ " ");
			System.out.println(m.length());
		}	
			
	}

	public static void main(String[] args) {
		class_003 n= new class_003();
		n.toString();

	}

}
