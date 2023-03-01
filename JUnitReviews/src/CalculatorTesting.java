import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTesting {
	Calulator c1;

	@BeforeEach
	void setUp() throws Exception {
		c1 = new Calulator();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		c1.addNumber(5, 5);
		assertEquals(10, c1.getResult());
	}

}
