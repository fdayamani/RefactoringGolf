import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciIndexEdgeCaseTests {
	@Test
	public void whenNumberNotFoundThenIndexIsMinusOne() {
		assertEquals(-1, new FibonacciIndexer().findIndexOf(7));
	}

	@Test
	public void cannotFindIndexOfNegativeNumber() {
		assertEquals(-1, new FibonacciIndexer().findIndexOf(-1));
	}
}