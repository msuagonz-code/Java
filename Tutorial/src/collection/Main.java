package collection;

import collection.iterable.GenericList;

public class Main {

	public static void main(String[] args) {
		GenericList list = new GenericList<String>();
		list.items[0] = "a";
		
		System.out.println(list.items.length);

	}

}
