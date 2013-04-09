package OOP;

public class Main {
	
	public static void main(String args[])
	{
	
		Manual manual1 = new Manual("Java 4 Dummies", "J.Swift", 450, "Programming");
		Book book1 =  new Manual("Scream", "F.Green", 600, "Math");
	
		Book book2 = new Book(book1);
		
		
		manual1.About();
		book1.about();
		book2.about();
		
		System.out.println();
		System.out.println();
		
		manual1.read();
		book1.read();
		book2.read();
		
		
		
		
	}

}
