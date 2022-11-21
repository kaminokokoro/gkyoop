package ex3;

import java.util.ArrayList;

public class MyListIterator implements Iterator {
	private ArrayList<String> items;
	private int position;
 
	public MyListIterator(ArrayList<String> items) {
		this.items = items;
		this.position = 0;
	}
 
	public String next() {
		position++;
		return items.get(position);
	}
 
	public boolean hasNext() {
		if (position<items.size()-1) return true;
		return false;
	}
}
