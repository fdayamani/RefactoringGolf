import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

 
public class FibonacciIndexEdgeCaseTests {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void throwsIllegalArgumentExceptionWhenArgumentIsNotFoundInSequence() {
		thrown.expect(IllegalArgumentException.class);
		new FibonacciIndexer().findIndexOf(23);
	}

	@Test
	public void throwsIllegalArgumentExceptionWhenArgumentIsNegative() {
		thrown.expect(IllegalArgumentException.class);
		new FibonacciIndexer().findIndexOf(-3);
	}


}
