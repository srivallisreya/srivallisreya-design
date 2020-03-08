package behavioral_template_pattern;

public class Circle extends Color {
	String color;
	public void setcolor(String color) {
		this.color=color;
	}
	
	public String getcolor() {
		return this.color;
	}
	
	public void filled() {
		System.out.println("Filled "+this.getClass().getSimpleName()+" with "+color);
	}
	public void fill() {
		System.out.println("Fill the "+this.getClass().getSimpleName());
	}
	public void filling() {
		System.out.println("Filling");
	}
	

}
