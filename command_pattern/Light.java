package command_pattern;

public class Light extends OnOffReceiver{

	@Override
	public void on() {
		onOffSwitch = true;
		System.out.println("Lights on");
	}

	@Override
	public void off() {
		onOffSwitch = false;
		System.out.println("Lights off");
	}

}
