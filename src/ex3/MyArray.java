package ex3;

public class MyArray implements MyIterable {
	private static final int MAX_ITEMS = 6;
	private int numberOfItems;
	private String[] menuItems;
  
	public MyArray() {
		numberOfItems = 0;
		menuItems = new String[MAX_ITEMS];
	}
	public void enlarge(){
		System.arraycopy(menuItems,0,menuItems,0,menuItems.length*2);
	}
  
	public void addItem(String name) {
		if (numberOfItems>=menuItems.length){
			enlarge();
		}
		menuItems[numberOfItems]=name;
		numberOfItems++;
	}
 
	public String[] getMenuItems() {
		return menuItems;
	}
  
	public Iterator createIterator() {
		Iterator iterator= new MyArrayIterator(menuItems);
		return iterator;
	}
 
	public String toString() {
		return "My Array Structure";
	}
}
