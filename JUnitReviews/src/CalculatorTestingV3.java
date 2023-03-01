import static org.junit.jupiter.api.Assertions.assertEquals;

import junit.framework.TestCase;

public class CalculatorTestingV3 extends TestCase {
	Calulator c1;
	protected void setUp() throws Exception {
		c1 = new Calulator();
//		super.setUp();
	}

	protected void tearDown() throws Exception {
		
		super.tearDown();

	}
	public void test() {
		c1.addNumber(5, 5);
		assertEquals(10, c1.getResult());
	}

}
