package ex3;

public class MyArrayIterator implements Iterator {
	private String[] items;
	private int position;
 
	public MyArrayIterator(String[] items) {
		this.items = items;
		this.position = 0;
	}
 
	public String next() {
		position++;
		return items[position];
	}
 
	public boolean hasNext() {
		if (position<items.length-1) return true;
		return false;
	}
}
