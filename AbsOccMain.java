import abstraction_occurance.Episode;
import abstraction_occurance.TvSeries;

public class AbsOccMain {

	public static void main(String[] args) {
		TvSeries someTvSeries = new TvSeries("Some Tv Series");
		someTvSeries.addEpisode(new Episode("First Episode", 40, 1));
		someTvSeries.addEpisode(new Episode("Second Episode", 38, 1));
		someTvSeries.addEpisode(new Episode("Third Episode", 42, 1));
		someTvSeries.addEpisode(new Episode("First Episode", 42, 2));
		
		System.out.println(someTvSeries);
		
	}

}
