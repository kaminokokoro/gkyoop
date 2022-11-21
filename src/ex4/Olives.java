package ex4;

public class Olives extends ToppingDecorator {
	public Olives(Bread bread) {
		this.bread = bread;
	}
 
	public String getDescription() {
		return bread.getDescription() + ", Olives";
	}

	@Override
	public String toString() {
		return "Olives{" +
				"bread=" + bread +
				", description='" + description + '\'' +
				'}';
	}

	public double cost() {
		return bread.cost() + 2.0;
	}
}
