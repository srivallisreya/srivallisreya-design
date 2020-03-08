package structural_design_pattern;

public class circle extends shape {
	double area;
	public circle(color_fill c,int r) {
		super(c);
		area=3.14*r*r;
		
	}
	@Override
	public String display() {
		System.out.println("----"+this.getClass().getSimpleName()+"----");
		String s="Area : "+String.valueOf(area)+"\ncolor_filled : "+color.display();
		return s;
	}

}
