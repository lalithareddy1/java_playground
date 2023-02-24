package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratingCollections {
	
	public static void main(String[] args) {
		
		Collection<String> collection = new ArrayList<String>();
		collection.add("Java");
		collection.add("python");
		collection.add("C");
		
		System.out.println("Iterating through while loop");
		Iterator<String> iterator = collection.iterator();			
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("Iterating through for loop");
		for(Iterator<String> itr = collection.iterator(); itr.hasNext();) {
			System.out.println(itr.next());
		}
		
		System.out.println("Iterating through for each ");
		for(String s: collection) {
			System.out.println(s);
		}

		
	}
	
	


}
