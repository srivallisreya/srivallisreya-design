package structural_design_pattern2;

public abstract class decorator implements Shape_fill {
	public Shape_fill decorate;
	
	public decorator(Shape_fill decorate) {
		this.decorate=decorate;
	}

	public void draw() {
		// TODO Auto-generated method stub
		decorate.draw();

	}

}
