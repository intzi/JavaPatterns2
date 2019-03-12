package command_pattern;

public abstract class OnOffReceiver {
	
	protected boolean onOffSwitch;
	
	public OnOffReceiver() {
		onOffSwitch = false;
	}

	public boolean isLightSwitch() {
		return onOffSwitch;
	}

	public abstract void on();
	
	public abstract void off();
	
}
