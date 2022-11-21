package ex4;

import java.util.*;
import java.util.Comparator;
public class BreadStore {
	private List<Bread> breads;

	public BreadStore() {
		breads = new LinkedList<>();
	}

	/**
	 * Giả sử bánh mỳ được làm không cho một loại gia vị nhiều hơn một lần.
	 * Bắt đầu, tạo ra và cho vào cửa hàng:
	 *  5 bánh mỳ ThickcrustBread chỉ có cheese,
	 *  5 bánh mỳ ThickcrustBread chỉ có olives,
	 *  5 bánh mỳ ThickcrustBread có cả cheese và olives,
	 *  5 bánh mỳ ThincrustBread chỉ có cheese,
	 *  5 bánh mỳ ThincrustBread chỉ có olives,
	 *  5 bánh mỳ ThincrustBread có cả cheese và olives.
	 */
	public void init() {
		 for (int i =0;i<5;i++){
			 ThickcrustBread thickcrustBread=new ThickcrustBread();
			 Cheese cheese = new Cheese(thickcrustBread);
			 breads.add(cheese);
		 }
		 for (int i =0;i<5;i++){
			 ThickcrustBread thickcrustBread=new ThickcrustBread();
			 Olives olives = new Olives(thickcrustBread);
			 breads.add(olives);
		 }
		 for (int i =0;i<5;i++){
			 ThickcrustBread thickcrustBread=new ThickcrustBread();
			 Cheese cheese = new Cheese(thickcrustBread);
			 Olives olives = new Olives(cheese);
			 breads.add(olives);
		 }
		 for (int i =0;i<5;i++){
			 ThincrustBread thincrustBread=new ThincrustBread();
			 Cheese cheese = new Cheese(thincrustBread);
			 breads.add(cheese);
		 }
		 for (int i =0;i<5;i++){
			 ThincrustBread thincrustBread=new ThincrustBread();
			 Olives olives = new Olives(thincrustBread);
			 breads.add(olives);
		 }
		 for (int i =0;i<5;i++){
			 ThincrustBread thincrustBread=new ThincrustBread();
			 Cheese cheese = new Cheese(thincrustBread);
			 Olives olives = new Olives(cheese);
			 breads.add(olives);
		 }
	}

	/**
	 * Thêm bánh mỳ vào cửa hàng.
	 */
	public void add(Bread bread) {
		breads.add(bread);
	}

	/**
	 * Giả sử cửa hàng bán một cái bánh mỳ nào đó,
	 * Bánh mỳ được lấy ra để bán là bánh mỳ đầu tiên có giá bằng giá
	 *  bánh mỳ yêu cầu.
	 * Nếu còn bánh mỳ để bán thì trả về giá trị true,
	 *  nếu không còn trả về giá trị false.
	 */
	public boolean sell(Bread bread) {
		for (Bread bread1:breads) {
			if (bread1.cost()==bread.cost()){
				breads.remove(bread1);
				return true;
			}
		}
		return false;
	}

	/**
	 * In ra những bánh mỳ còn trong cửa hàng.
	 */
	public void print() {
		for (Bread bread1:breads) {
			System.out.println(bread1);
		}
	}

	/**
	 * Sắp xếp các bánh mỳ còn lại theo thứ tự được cho bởi order,
	 * nếu order là true, sắp xếp theo thứ tự tăng dần,
	 * nếu order là false, sắp xếp theo thứ tự giảm dần.
	 * Việc sắp xếp không làm thay đổi thứ tự của bánh mỳ trong cửa hàng.
	 */
	public List<Bread> sort(boolean order) {
		List<Bread> result=new ArrayList<Bread>();
		result.addAll(breads);
		Collections.sort(result, new Comparator<Bread>() {
			@Override
			public int compare(Bread o1, Bread o2) {
				if (order) return Double.compare(o1.cost(),o2.cost());
				return Double.compare(o2.cost(),o1.cost());
			}
		});
		return result;
	}

	/**
	 * Lọc ra howMany cái bánh mỳ có giá cao nhất hoặc thấp nhất,
	 * nếu order là true thì lọc ra bánh mỳ có giá cao nhất,
	 * nếu order là false thì lọc ra bánh mỳ có giá thấp nhất.
	 */
	public List<Bread> filter(int howMany, boolean order) {
		List<Bread> result= new ArrayList<Bread>();
		if (breads.size()==0){
			return result;
		}
		List<Bread> temp= new ArrayList<Bread>();
		temp.addAll(breads);
		Collections.sort(temp, new Comparator<Bread>() {
			@Override
			public int compare(Bread o1, Bread o2) {
				if (order) return Double.compare(o1.cost(),o2.cost());
				return Double.compare(o2.cost(),o1.cost());
			}
		});
		for (int i =0;i<howMany;i++) {
			result.add(temp.get(i));
		}
		return result;
	}

	public static void main(String args[]) {
		BreadStore breadStore = new BreadStore();
		breadStore.init();

		/*
		* Sau khi khởi tạo số bánh mỳ cho cửa hàng, viết chương trình demo:
		* - Thêm một số bánh mỳ vào cửa hàng
		* - Bán một số bánh mỳ từ cửa hàng
		* - In ra số bánh mỳ còn lại theo thứ tự giá tăng dần.
		* - In ra nhiều nhất 10 cái bánh mỳ có giá thấp nhất còn trong cửa hàng.
		*/
		/* TODO */
		ThincrustBread thincrustBread=new ThincrustBread();
		Cheese cheese = new Cheese(thincrustBread);
		breadStore.add(thincrustBread);
		breadStore.sell(cheese);
		breadStore.sort(true);
		breadStore.print();

		for (Bread bread1: breadStore.filter(10,false)) {
			System.out.println(bread1);
		}

	}
}
