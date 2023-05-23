package org.main.java.calulator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import java.util.Random;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.main.java.calculator.Calculator;

public class CalculatorTest {
	static float num1;
	static float num2;

	@BeforeAll
	static void setup() {
		num1 = 10.4f;
		num2 = 50.4f;
	}


	@Test
	@DisplayName("Verifica addizione")
	void addTest() {
		final float attRes = num1 + num2;
		final float res = Calculator.add(num1, num2);
		
		assertEquals(attRes, res, "Addizione");
	}
	
	@Test
	@DisplayName("Verifica sottrazione")
	void subtractTest() {
		assumeTrue(num1 > num2);
		final float attRes = num1 - num2;
		final float res = Calculator.subtract(num1, num2);
		assertEquals(attRes, res, "Sottrazione skip");
	}
	
	@Test
	@DisplayName("Verifica sottrazione 2")
	void subtractTest2() {
	    final float num1 = 7.6f;
	    final float num2 = 4.6f;
	    assumeTrue(num1 > num2);
	    final float attRes = num1 - num2;
	    final float res = Calculator.subtract(num1, num2);
	    
	    assertEquals(attRes, res, "Sottrazione res 3");
	}
	
	@Test
	@DisplayName("Verifica divisione")
	void divideTest() {
	    final float num1 = 7.6f;
	    final float num2 = 4.6f;
	    assumeTrue(num1 > num2);
	    final float attRes = num1 / num2;
	    final float res = Calculator.divide(num1, num2);
	    
	    assertEquals(attRes, res, "Divisione res positive");
	}
	
	@Test
	@DisplayName("Verifica divisione")
	void divideTest2() {
	    final float num1 = 2.6f;
	    final float num2 = 6.6f;
	    assumeTrue(num1 > num2);
	    final float attRes = num1 / num2;
	    final float res = Calculator.divide(num1, num2);
	    
	    assertEquals(attRes, res, "Divisione res skip");
	}
	
	@Test
	@DisplayName("Verifica moltiplicazione")
	void multiplyTest() {
	    final float num1 = 7.6f;
	    final float num2 = 4.6f;
	    assumeTrue(num1 > num2);
	    final float attRes = num1 * num2;
	    final float res = Calculator.multiply(num1, num2);
	    
	    assertEquals(attRes, res, "Moltiplicazione res positive");
	}
	

}
