package proxy_pattern;

public class BookParserProxy implements Parser{

	private BookParser parser;
	private String book;
	private String title;
	
	public BookParserProxy(String name, String book) {
		this.book = book;
		this.title = name;
	}

	@Override
	public String getTitle() {
		return title;
	}
	
	@Override
	public int getNumberOfPages() {
		
		if(parser == null)
			parser = new BookParser(title, book);
		
		return parser.getNumberOfPages();
	}

	@Override
	public int getNumberOfChapters() {
		if(parser == null)
			parser = new BookParser(title, book);
		
		return parser.getNumberOfChapters();
	}


}
