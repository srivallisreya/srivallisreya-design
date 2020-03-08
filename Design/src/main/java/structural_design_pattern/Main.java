package structural_design_pattern;

public class Main {
	public static void main(String args[]) {
		shape c=new circle(new red(),4);
		System.out.println(c.display());
		System.out.println();
		shape r=new rectangle(new green(),4,3);
		System.out.println(r.display());
	}
}
