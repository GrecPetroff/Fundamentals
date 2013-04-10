package edu.endava.fundamentals.junit;

import junit.framework.TestCase;

public class MathTest extends TestCase
{
	  public void testAdd() {
	        int num1 = 3;
	        int num2 = 2;
	        int total = 5;
	        int sum = 0;
	        sum = Math.add(num1, num2);
	        assertEquals(sum, total);
	  }
}
