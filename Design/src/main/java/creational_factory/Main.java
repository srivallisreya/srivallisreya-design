package creational_factory;

public class Main {
	public static void main(String args[]) {
		shape_factory o=new shape_factory();
		
		Shape s=o.getshape("rectangle");
		
		s.fill(20*30);
		
		Shape s1=o.getshape("circle");
		s1.fill(10);
		
		
	}

}
