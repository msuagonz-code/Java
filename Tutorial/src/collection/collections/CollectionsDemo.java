package collection.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
 * https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html
 * 
 * */

public class CollectionsDemo {

	public static void show() {
		Collection<String> collection = new ArrayList<>();
		
		/*
		collection.add("a");
		collection.add("b");
		collection.add("c");
		
		for(var item: collection){
			System.out.println(item);
		}
		*/
		
		Collections.addAll(collection, "a", "b", "c", "d");
		System.out.println(collection);
		
		Collection<String> other = new ArrayList<>();
		other.addAll(collection);
		
		System.out.println(collection == other);
		System.out.println(collection.equals(other));
		
		Object[] arreglo = collection.toArray();
		String[] arregloString = collection.toArray(new String[0]);
		
		System.out.println(arregloString);
		System.out.println("size: " + collection.size());
		
		collection.remove("a");
		
		System.out.println("despues del remove: "+ collection);
		
		var contiene = collection.contains("a");
		
		System.out.println("Contiene a: "+ contiene);
		
		collection.clear();
		
		System.out.println(collection);
	}
	
}
