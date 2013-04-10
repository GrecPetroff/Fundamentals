package edu.endava.fundamentals.junit;

import junit.framework.TestCase;

public class CalculationTest extends TestCase {

	private Calculation calcObj;




	public CalculationTest(String testName) {

		super(testName);

		calcObj = new Calculation();

	}


	public final void testAdd() {

		assertEquals(calcObj.add(20, 30), 50);

	}


	public final void testSubtract() {

		assertEquals(calcObj.subtract(60, 30), 30);

	}


	public final void testMultiply() {

		assertEquals(calcObj.multiply(100, 3), 300);

	}


	public final void testDivide() {

		assertEquals(calcObj.divide(333, 3), 111.0);

		try {

			assertEquals(calcObj.divide(100, 0), 20.0);

		} catch (Exception e) {

			// Exception is expected so asserting for true.

			assertTrue(true);

		}

	}
}
