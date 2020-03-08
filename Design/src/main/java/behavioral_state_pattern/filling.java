package behavioral_state_pattern;

public class filling implements Color{
	public String state() {
		return this.getClass().getSimpleName();
	}

}
