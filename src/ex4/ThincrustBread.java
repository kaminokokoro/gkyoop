package ex4;

public class ThincrustBread extends Bread {
  
	public ThincrustBread() {
		description = "Thin crust bread, with tomato sauce";
	}

	@Override
	public String toString() {
		return "ThincrustBread{" +
				"description='" + description + '\'' +
				'}';
	}

	public double cost() {
		return 20.0;
	}
}

