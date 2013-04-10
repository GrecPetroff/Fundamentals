package edu.endava.fundamentals.input_output;

import java.util.Scanner;

public class Console {

	public static void main(String[] args)
	{
	    Scanner scanner = new Scanner( System.in );

	    System.out.print( "Type some data for the program: " );

	    String input = scanner.nextLine();
	    System.out.print( "\nType some number for the program: " );
	    int number = scanner.nextInt();
	    System.out.println( "input = " + input  + " number: " + number);
	    scanner.close();
	    
	    
	    
	}
}
