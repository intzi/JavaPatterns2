package abstract_factory;

public class LinuxFactory extends AbstractFactory {

	@Override
	public Alert createAlert(String type, String msg) {
		
		Alert alert = null;
		
		if(type.equals("SadAlert")) {
			alert = new SadAlert();
			alert.setMessage(msg+" from LinuxFactory");
		}
		//else if()...
		
		return alert;
	}

	@Override
	public Button createButton(String type) {
		
		Button button = null;
		
		if(type.equals("HappyButton")) {
			button = new HappyButton();
			button.setName("Linux Button");
		}
		//else if()..
		
		
		return button;
	}

}
