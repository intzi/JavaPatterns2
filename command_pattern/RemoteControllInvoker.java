package command_pattern;

public class RemoteControllInvoker {
	
	private ICommand on;
	private ICommand off;
	
	public RemoteControllInvoker() {
	
	}
	
	public void setOnCommand(ICommand command) {
		on = command;
	}
	
	public void setOffCommand(ICommand command) {
		off = command;
	}
	
	
	public void onButtonPressed() {
		on.execute();
	}
	
	public void offButtonPressed() {
		off.execute();
	}
	
}
