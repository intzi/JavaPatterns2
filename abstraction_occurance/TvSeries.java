package abstraction_occurance;
import java.util.ArrayList;

public class TvSeries {

	private String name;
	private ArrayList<Episode> episodes;
	
	public TvSeries(String name){
		this.name = name;
		episodes = new ArrayList<Episode>();
	}
	
	public void addEpisode(Episode e) {
		episodes.add(e);
	}
	
	public void deleteEpisode(Episode e) {
		episodes.remove(e);
	}
	
	public String getName() { return name; }
	public ArrayList<Episode> getEpisodes() { return episodes; }
	@Override
	public String toString() {
		String toStr = "";
		toStr = name + "\n Episodes: "+episodes.size();
		for(Episode e : episodes) {
			toStr += "\n\t"+e.getTitle();
		}
		
		return toStr;
	}
}
