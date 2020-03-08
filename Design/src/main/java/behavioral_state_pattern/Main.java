package behavioral_state_pattern;

public class Main {
	public static void main(String args[]) {
		statefill s=new statefill();
		
		Color un_filled=new unfilled();
		Color fill=new filled();
		Color in_filling=new filling();
		
		s.setcolor(un_filled);
		System.out.println(s.state());
		
		s.setcolor(fill);
		System.out.println(s.state());
		
		s.setcolor(in_filling);
		System.out.println(s.state());
	}

}
