package behavioral_template_pattern;

public abstract class Color {
	public abstract void fill();
	public abstract void filled();
	public abstract void filling();
	
	public void display() {
		fill();
		filling();
		filled();
		
	}

}
