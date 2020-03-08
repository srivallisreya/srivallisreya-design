package structural_design_pattern2;

public class greendecorator extends decorator {
	public greendecorator(Shape_fill decorate) {
		super(decorate);
	}
	@Override
	public void draw() {
		decorate.draw();
		setgreen(decorate);
	}
	public void setgreen(Shape_fill decorate) {
		System.out.println("Filled with: Green");
	}


}
