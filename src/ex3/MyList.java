package ex3;

import java.util.ArrayList;

public class MyList implements MyIterable {
	private ArrayList<String> menuItems;
 
	public MyList() {
		menuItems = new ArrayList<String>();
	}

	public void addItem(String name) {
		menuItems.add(name);
	}
 
	public ArrayList<String> getMenuItems() {
		return menuItems;
	}
  
	public Iterator createIterator() {
		Iterator iterator = new MyListIterator(menuItems);
		return iterator;
	}
  
	public String toString() {
		StringBuilder  str = new StringBuilder();
		for (String item:menuItems) {
			str.append(item);
		}
		return String.valueOf(str);
	}
}
