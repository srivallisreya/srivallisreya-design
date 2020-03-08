package structural_design_pattern2;

public class reddecorator extends decorator {
	public reddecorator(Shape_fill decorate) {
		super(decorate);
	}
	@Override
	public void draw() {
		decorate.draw();
		setred(decorate);
	}
	public void setred(Shape_fill decorate) {
		System.out.println("Filled with: Red");
	}

}
