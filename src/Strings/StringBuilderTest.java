package Strings;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		StringBuilder strBld = new StringBuilder("Alexei ");
		strBld.append( true);
		System.out.println("Our String " + strBld.toString());
		
		strBld.append(" "+ 5 + " " + 5. + " ");
		strBld.append( new char[] {'1','2','3'});
		System.out.println("Our String after appends : " + strBld.toString());
		
		System.out.println("capacity : " + strBld.capacity());
		
		System.out.println("charAt 2 : " + strBld.charAt(2));
		
		System.out.println("lenght : " + strBld.length());
		
		System.out.println("delete XEI : " + strBld.delete(4, 6));
		
		System.out.println("insert ANDR : " + strBld.insert(4, "andr"));
		
		System.out.println("reverse : " + strBld.reverse());
	}
}
