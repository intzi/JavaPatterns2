package abstract_factory;

// This must be an interface.
// Interface with the more general term.
// Interface or Abstract class.
public abstract class AbstractFactory {
	
	public abstract Alert createAlert(String type, String msg);
	public abstract Button createButton(String type);
	
}
