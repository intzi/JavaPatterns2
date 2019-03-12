package abstract_factory;

public abstract class Alert {
	private String message;
	
	public Alert() {
		this.message = "Unknown";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
