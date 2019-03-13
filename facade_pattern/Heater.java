package facade_pattern;

public class Heater {
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
		
		String str = "Heater is: ";
		if(state)
			str += "on";
		else
			str += "off";
		return str;
	}
}
