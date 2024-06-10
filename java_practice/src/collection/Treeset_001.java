package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset_001 {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts = new TreeSet<Integer>() ; 
		
		// Add values
		ts.add(10); ts.add(20);ts.add(30); ts.add(40); ts.add(50);ts.add(60);
		ts.add(70); ts.add(70);ts.add(80);
		
		//To print All values 
		//System.out.println(ts);
		
		
		//ts.remove (70);
		//System.out.println(ts);
		
		//To remove all values 
		//ts.clear();
		//System.out.println(ts);
		
		//To  check specific values
		//System.out.println(ts.contains(30));
		
		// create duplicate copy 
		//System.out.println(ts.clone());
		
		//To print values using iterator
		Iterator<Integer> it = ts.iterator();
		while (it.hasNext()){
		System.out.println(it.next());
		
		}
}
}
	