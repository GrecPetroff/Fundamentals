package edu.endava.fundamentals.strings;

public class StringFormatting {

	public static void main(String[] args) {

		System.out.println("abc");
		String cde = "cde";
		System.out.println("abc" + cde);

		//format example 1
		String result = String.format("10 / 3 = %.2f", 10.0 / 3.0);
		System.out.println(result);
		
		//format example 2
		result = String.format(
				"Today we processed %,d transactions.Its %s for us.", 100000,
				"good");

		System.out.println(result);

		//matches example 1
		String str = "this";
		System.out.println(str.matches(".his"));

		//matches example 2
		str = "hhhhis";
		System.out.println(str.matches(".h++is"));

		// Parsing example 1
		String phrase = "the music made   it   hard      to        concentrate";
		String delims = "[ ]++";
		String[] tokens = phrase.split(delims);
		for (int i = 0; i < tokens.length; i++) {
			System.out.print(tokens[i] + "|");
		}
		System.out.println();
		
		// Parsing example 2
		String employee = "Smith,Katie,3014,,8.25,6.5,,,10.75,8.5";
		delims = "[,]";
		tokens = employee.split(delims);
		for (int i = 0; i < tokens.length; i++) {
			System.out.print(tokens[i] + "|");
		}
		System.out.println();
		
		// Parsing example 3
		String str2 = "This is a sentence.  This is a question, right?  Yes!  It is.";
		delims = "[ .,?!]+";
		tokens = str2.split(delims);
		for (int i = 0; i < tokens.length; i++) {
			System.out.print(tokens[i] + "|");
		}
	
	}
}
