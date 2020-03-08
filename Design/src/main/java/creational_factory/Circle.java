package creational_factory;

public class Circle implements Shape {
	public void fill(double area) {
		System.out.println("Fill "+this.getClass().getSimpleName()+" having area "+String.valueOf(area));

	}

}
