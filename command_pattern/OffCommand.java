package command_pattern;

public class OffCommand implements ICommand{

	private OnOffReceiver light;
	
	public OffCommand(OnOffReceiver light) {
		this.light = light; 
	}
	
	
	@Override
	public void execute() {
		light.off();
	}

	@Override
	public void unexecute() {
		light.on();
	}

}
