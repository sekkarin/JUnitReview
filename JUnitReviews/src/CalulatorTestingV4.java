import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalulatorTestingV4 {
	Calulator c1;

	@Before
	public void setUp() throws Exception {
		c1 = new Calulator();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
//		fail("Not yet implemented");
		c1.addNumber(5, 5);
		assertEquals(10, c1.getResult());
	}

}
