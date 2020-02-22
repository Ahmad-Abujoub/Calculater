import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class CalculaterTest {

	@Test
	void test() {
		int a = 10;
		int b = 20;
		Calculater calc = new Calculater();
		// Act
		int result = calc.CalcAdd(a, b);
		// Assert
		Assert.assertTrue(result > 0);
		
	}

}
