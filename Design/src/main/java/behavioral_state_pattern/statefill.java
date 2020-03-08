package behavioral_state_pattern;


public class statefill implements Color {
	public Color color;
	
	public void setcolor(Color color) {
		this.color=color;
	}
	
	/*public Color getcolor() {
		return this.color;
	}*/
	
	public String state() {
		// TODO Auto-generated method stub
		return color.state();
	}

}
