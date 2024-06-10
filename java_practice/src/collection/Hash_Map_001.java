package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.print.attribute.SetOfIntegerSyntax;

public class Hash_Map_001 {

	public static void main(String[] args) {

		HashMap<Integer, String>  hm = new HashMap<Integer,String>();
		
		//Add values
		hm.put(0, "ab");
		hm.put(1, "cd");
		hm.put(5, "ef");
		hm.put(6, "gh");
		hm.put(7, "ij");
		// hm.put (0,"kl")
		//System.out.println(hm);
		
		// to remove value 
		//hm.remove(7);
		//hm.remove(5, "ef");
		//System.out.println(hm);
		
		// to replace one value
		//hm.replace(1, "xy");
	//	hm.replace(5, "ef","st");
		//System.out.println(hm);
		
		//to get value with respect to index
	//	System.out.println(hm.get(6));
		
		// to get size
	//	System.out.println(hm.size());
		
		// to search any key
	//	System.out.println(hm.containsKey(7));
		
		// to search any value
	//	System.out.println(hm.containsValue("ab"));
		
		// create duplicate copy 
		//System.out.println(hm.clone());
		
		//to remove all values
		//hm.clear();
		//System.out.println(hm);
		
		//to print all values using iterator
		// convert hashmap to set 
	Set<Entry<Integer,String>> s = hm.entrySet();
		Iterator<Entry<Integer,String>> it = s.iterator();
		
		while (it.hasNext()) {
			Map.Entry m = (Map.Entry) it.next();
			System.out.println("key is :-"+m.getKey());
			System.out.println("value :- "+m.getValue());
			
			
		}
	
		
		
		
		
	}

}
