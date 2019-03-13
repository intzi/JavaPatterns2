package facade_pattern;

public class HouseFacade {
	
	private Heater heater;
	private Light light;
	private Tv tv;
	
	public HouseFacade(Heater heater, Light light, Tv tv) {
		
		this.heater = heater;
		this.light = light;
		this.tv = tv;
	}
	
	public void leavingTheHouse(){
		heater.off();
		light.off();
		tv.off();
	}
	
	public void relaxing() {
		heater.on();
		light.off();
		tv.on();
	}
	
	public void focus() {
		heater.on();
		light.on();
		tv.off();
	}
}
