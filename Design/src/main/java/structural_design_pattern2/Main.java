package structural_design_pattern2;

public class Main {
	public static void main(String args[]) {
		Shape_fill circle = new circle();
		
		Shape_fill redcircle = new reddecorator(circle);
		Shape_fill greencircle = new greendecorator(circle );
		
		System.out.println("Circle without decorator");
		circle.draw();
		
		System.out.println("\ndetails of the shape with decorator");
		redcircle.draw();
		
		System.out.println("\ndetails of the shape with decorator");
		greencircle.draw();
	}

}
