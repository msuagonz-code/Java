package collection.iterable;

import java.util.ArrayList;

public class GenericList<T> {

	public ArrayList<T> items = new ArrayList<>();
	private int count;
	
	public void add(T item) {
		items[count++] = item;
	}
	
	public T get(int index) {
		return items[index];
	}
	
}
