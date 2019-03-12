import command_pattern.RemoteControllInvoker;
import command_pattern.Light;
import command_pattern.OffCommand;
import command_pattern.OnCommand;
import command_pattern.OnOffReceiver;

public class CommandMain {
	
	public static void main(String[] args) {
		
		System.out.println("Design Patterns - Command Pattern");
		
		RemoteControllInvoker remote = new RemoteControllInvoker();
		OnOffReceiver light = new Light();
		OnCommand lightOn = new OnCommand(light);
		OffCommand lightOff = new OffCommand(light);
		
		remote.setOnCommand(lightOn);
		remote.setOffCommand(lightOff);
		
		remote.onButtonPressed();
		remote.offButtonPressed();
		
		
	}
}
