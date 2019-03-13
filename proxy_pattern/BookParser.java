package proxy_pattern;

public class BookParser implements Parser{

	private int numOfPages;
	private int numOfChapters;
	private String title;

	public BookParser(String name, String book) {
		
		// The constructor takes 4 secs to complete the loading
		System.out.println("Loading Book..");
		this.title = name;
		setNumberOfChapters(book);
		setNumberOfPages(book);
		System.out.println("Book Loaded!");
	}
	
	@Override
	public String getTitle() {
		return this.title;
	}
	
	private void setNumberOfPages(String book) {
		
		String[] pages = book.split("\n");
		// Lets say that we are doing some heavy loading here..
		sleep(2000);
		numOfPages = pages.length;
	}
	
	@Override
	public int getNumberOfPages() {
		return numOfPages;
	}
	
	private void setNumberOfChapters(String book) {
		
		String[] words = book.split(" ");
		int counter = 0;
		
		for(String word : words) {
			if(word.toLowerCase().equals("chapter"))
				counter++;
		}
		// Lets say that we are doing some heavy loading here..
		sleep(2000);
		numOfChapters = counter;
	}

	@Override
	public int getNumberOfChapters() {
		return numOfChapters;
	}

	private void sleep(int mills) {
		try {
			Thread.sleep(mills);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
