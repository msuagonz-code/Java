package collection.iterable;

import java.util.Iterator;

/*
 * https://docs.oracle.com/javase/8/docs/api/java/lang/Iterable.html
 * https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
 * 
 * Iterable es una interface que habilita a una clase a ser iterada por un objeto de tipo iterator
 * Iterator es una interface que habilita a una clase a iterar a un objeto de tipo iterable
 * 
 * */

public class GenericList<T> implements Iterable<T>{

	private T[] items = (T[]) new Object[10];
	private int count;
	
	public void add(T item) {
		items[count++] = item;
	}
	
	public T get(int index) {
		return items[index];
	}

	@Override
	public Iterator<T> iterator() {
 		return new ListIterator(this);
	}
	
	private class ListIterator implements Iterator<T> {

		private GenericList<T> list;
		private int index;
		
		public ListIterator(GenericList<T> list) {
			this.list = list;
		}
		
		@Override
		public boolean hasNext() {
			return (index < list.count);
		}

		@Override
		public T next() {
			return list.items[index++];
		}
		
	}
} 
