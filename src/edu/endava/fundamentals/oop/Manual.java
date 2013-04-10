package edu.endava.fundamentals.oop;

public class Manual extends Book implements BookUsing{
	
	private String subject ;
	
	public Manual() {
		super();
		subject = "uncategorised";
	}
	
	public Manual(String book_name, String auth, int pages, String subj) {
		super(book_name,auth,pages);
		subject = subj;
	}
	
	public Manual(Manual obj) {
		super(obj);
		subject = obj.subject;
	}
	
	String getSubject() {
		return this.subject;
	}
	
	void setSubject(String subj) {
		this.subject = subj;
	}
	
	void About() {
		System.out.print( "Its a manual " + this.getBookName() + " by " 
						+ this.getAmountPages() + " with " + this.getAmountPages() + " pages");
		System.out.println(" Subject: " + this.subject );
	}
	
	public void read() {
		System.out.println("I read manual: " + this.getBookName() + " by " 
							+ this.getAuthor() + " with subject " + this.subject);
	}
	public void browse() {
		
	}
	
	public void write() {
		System.out.println("Written (manual) by " + this.getAuthor());
	}
	
	
}
