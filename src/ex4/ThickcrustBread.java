package ex4;

public class ThickcrustBread extends Bread {
  
	public ThickcrustBread() {

		description = "Thick crust bread, with tomato sauce";
	}

	@Override
	public String toString() {
		return "ThickcrustBread{" +
				"description='" + description + '\'' +
				'}';
	}

	public double cost() {
		return 30.0;
	}
}

