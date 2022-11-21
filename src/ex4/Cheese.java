package ex4;

public class Cheese extends ToppingDecorator {
	public Cheese(Bread bread) {
		this.bread = bread;
	}
 
	public String getDescription() {
		return bread.getDescription() + ", Cheese";
	}

	@Override
	public String toString() {
		return "Cheese{" +
				"bread=" + bread +
				", description='" + description + '\'' +
				'}';
	}

	public double cost() {
		return bread.cost() + 1.0;
	}
}
