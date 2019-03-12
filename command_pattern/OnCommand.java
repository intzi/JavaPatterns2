package command_pattern;

public class OnCommand implements ICommand{

	private OnOffReceiver light;
	
	public OnCommand(OnOffReceiver light) {
		this.light = light;
	}
	
	
	@Override
	public void execute() {
		light.on();
	}

	@Override
	public void unexecute() {
		light.off();
	}

}
