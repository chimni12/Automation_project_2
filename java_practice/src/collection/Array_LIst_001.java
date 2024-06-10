package collection;

import java.util.ArrayList;

public class Array_LIst_001 {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();
		
		// Add values 
		names.add(" akanksha");
		names.add(" Ashvini_p");
		names.add(" Ashvini_s");
		names.add(" Ashwini_m");
		names.add(" Vaibhav");
		names.add(" shruti");
		names.add(" nikita");
		names.add(" vaishnvi");
		names.add(" dnyanshwar");
		names.add(" Akash");
		names.add(" poonam");
		names.add(" shubham");
		names.add(" rahul");
		names.add(" Abhinav");
		names.add(null);
		names.add(" akanksha");
		names.add(" abc");
		
		// Add values with index
		names.add(17,"def");
		
		// to print all values 
		System.out.println(names);
		
		// print values with respect index
		//System.out.println(names.get(17));
		
		// Remove values 
		//names.remove(17);
		//System.out.println(names);
		
		//To remove all values
		//names.clear();
		//System.out.println(names);
		
		//To check specific values
		System.out.println(names.contains("akanksha"));
		
		// To get index
		
		System.out.println(names.indexOf("nikhita"));
		
		//To get size
		System.out.println(names.size());
		
		// create copy
		System.out.println(names.clone());
	
		
		
		
	}

}
