package collection;

import java.util.Iterator;

import collection.iterable.GenericList;

public class Main {

	public static void main(String[] args) {
		GenericList list = new GenericList<String>();

		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		for(Object item : list) {
				System.out.println(item);
		}
		
	}

}
