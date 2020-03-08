package structural_design_pattern;

public class rectangle extends shape {
	double area;
	public rectangle(color_fill c,int l,int b) {
		super(c);
		area=l*b;
		
		
	}
	@Override
	public String display() {
		System.out.println("----"+this.getClass().getSimpleName()+"----");
		String s="Area : "+String.valueOf(area)+"\ncolor_filled : "+color.display();
		return s;
	}

}
