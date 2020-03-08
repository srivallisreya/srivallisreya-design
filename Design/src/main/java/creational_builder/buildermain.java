package creational_builder;

public class buildermain {
	public static void main(String args[]) {
		House h=new House(4)
				.Garage(true)
				.swimming_pool(true)
				.Fancy_statues(true)
				.Garden(true);
		details d1=new details(h);
		d1.display();
		
		System.out.println();
		
		House h1=new House(5)
				.Garage(true)
				.Garden(true);
		details d2=new details(h1);
		d2.display();
		
		
}
}
