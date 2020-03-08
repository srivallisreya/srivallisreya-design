package structural_design_pattern;

public abstract class shape {
	public color_fill color;
	shape(color_fill c){
		this.color=c;
	}
	abstract public String display();
}
