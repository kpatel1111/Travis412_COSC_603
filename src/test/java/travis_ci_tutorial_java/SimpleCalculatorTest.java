package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	/*
	 * The below test method is utilized to test the add method in the simple calculator class because it will
	 * receive two integer numbers and verify if both the expected and the actual values are the same results.
	 */
	@Test
	public void testAdd(){
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1,1),2);
	}
	/*
	 * The below test method is utilized to test the method in the simple calculator class because it will
	 * receive two integer numbers and will verify if both the expected and the actual values are the same results.
	 */
	@Test
	public void testMinus(){
		SimpleCalculator calculator = new SimpleCalculator();
		assertEquals(2,calculator.minus(5,3));
	}
}
