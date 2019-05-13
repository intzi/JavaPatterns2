package abstraction_occurance;

public class Episode {
	private String title;
	private int duration;
	private int season;
	
	public Episode(String title, int duration, int season) {
		this.title = title;
		this.duration = duration;
		this.season = season;
	}
	
	public String getTitle() { return title; }
	public int getDuration() { return duration; }
	public int getSeason() { return season; }
}
