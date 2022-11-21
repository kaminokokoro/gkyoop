package ex4;

public abstract class Bread {
	String description = "Bread";


	@Override
	public String toString() {
		return "Bread{" +
				"description='" + description + '\'' +
				'}';
	}

	public String getDescription() {
		return description;
	}
 
	public abstract double cost();
}
