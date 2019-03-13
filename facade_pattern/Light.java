package facade_pattern;

public class Light {
	private boolean state = false;

	public boolean isState() {
		return state;
	}

	public void on() {
		state = true;
	}
	
	public void off() {
		state = false;
	}
	
	@Override
	public String toString() {
		
		String str = "Lights are: ";
		if(state)
			str += "on";
		else
			str += "off";
		return str;
	}
}
