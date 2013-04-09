package OOP;

public class Book extends Article implements BookUsing {
	private String name;
	private String author;
	private int amountPages;
	
	public Book() {
		name = null;
		author = null;
		amountPages = 0;
	}
	
	public Book(String book_name, String book_author, int book_pages) {
		name = book_name;
		author = book_author;
		amountPages = book_pages;
	}
	
	public Book(Book obj) {
		name = obj.name;
		author = obj.author;
		amountPages = obj.amountPages;
	}
	
	String getAuthor() {
		return this.author;
	}
	void setAuthor(String name) {
		this.author = name;
	}
	
	String getBookName() {
		return this.name;
	}
	void setBookName(String name) {
		this.name = name;
	}
	
	int getAmountPages() {
		return this.amountPages;
	}
	
	void setAmountPages(int amount) {
		this.amountPages = amount;
	}
	
	void about() {
		System.out.print( "Its a book: " + this.name + " by " + this.author + " with " + this.amountPages + " pages" );
	}
	
	public void read ()	{
		System.out.println( "I read book: " + this.getBookName() + " by " + this.getAuthor() );
	}
	
	public void browse() { }



	
	
}
