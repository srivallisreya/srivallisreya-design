package structural_design_pattern2;

public class circle implements Shape_fill {
	//@Override
	public void draw() {
		System.out.println("Shape: "+this.getClass().getSimpleName());
	}
}
