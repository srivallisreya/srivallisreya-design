package creational_factory;

public class Rectangle implements Shape {
	
	public void fill(double area) {
		// TODO Auto-generated method stub
		System.out.println("Fill "+this.getClass().getSimpleName()+" having area "+String.valueOf(area));

	}

}
