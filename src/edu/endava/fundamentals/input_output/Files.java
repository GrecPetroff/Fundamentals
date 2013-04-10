package edu.endava.fundamentals.input_output;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Files {
	
	/* 
	 * Writing in file
	 * 
	 * */
	public static void writeTextFile(String fileName, String s) {
	   
		PrintWriter out = null;
		try {
			out = new PrintWriter( new FileWriter("" + fileName) );
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		out.print(s);
		
		out.close();

	  } 
	
	/* 
	 * Reading from file
	 * 
	 * */
	public static String readTextFile(String fileName) {
		  
		  String returnValue = "";
		  BufferedReader in = null;
		
		  try {
			in = new BufferedReader(new FileReader(fileName));
			returnValue = in.readLine();
			in.close();
		  
		  } catch (FileNotFoundException e) {
	
		  }
			catch(IOException ex) {	
				
		  }

		  return returnValue;
		} 
	
	

	public static void main(String[] args)
	{
		System.out.println(System.getProperty("user.dir")); 
		  String fileName = "foo.txt";
		  String returnValue = "";
		  
		  returnValue = readTextFile(fileName);
		  System.out.println(returnValue);
		  writeTextFile("foo1.txt", "hi");
		 
		  returnValue = readTextFile(fileName);
		  System.out.println(returnValue);
	}
	
}
