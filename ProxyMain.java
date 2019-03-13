import proxy_pattern.BookParser;
import proxy_pattern.BookParserProxy;

public class ProxyMain {
	
	public static void main(String[] args) {
		
		System.out.println("Design Patterns - Virtual Proxy");
		
		String book = "Chapter 1\nHello\nFrom me!";
		String title = "Design Patterns";
		
		// The parser is doing some heavy loading that we might not even use if we don't call the getNumber methods
		BookParser bp = new BookParser(title, book);
		System.out.println("Title: "+bp.getTitle());
		System.out.println("Chapters: "+bp.getNumberOfChapters());
		System.out.println("Pages: "+bp.getNumberOfPages());
		
		
		System.out.println("\n\n");
		// Here instead we are going to use the Proxy of the parser.
		// So that we can make sure that the heavy loading happens only when we invoke the methods that really need the parser to load
		BookParserProxy bpp = new BookParserProxy(title, book);
		System.out.println("Title: "+bpp.getTitle());
		System.out.println("Chapters: "+bpp.getNumberOfChapters());
		System.out.println("Pages: "+bpp.getNumberOfPages());
		
	}
}
