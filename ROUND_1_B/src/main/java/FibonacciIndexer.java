import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FibonacciIndexer {

	public int findIndexOf(long numberInFibonacciSequence) {
		if(isPositiveAndLessThanTwo(numberInFibonacciSequence)){
			return indexIsTheSameAs(numberInFibonacciSequence);
		}
		return seek(numberInFibonacciSequence);
	}

	private int indexIsTheSameAs(long numberInFibonacciSequence) {
		return (int)numberInFibonacciSequence;
	}

	private boolean isPositiveAndLessThanTwo(long numberInFibonacciSequence) {
		return numberInFibonacciSequence >= 0 && numberInFibonacciSequence < 2;
	}

	private int seek(long numberInFibonacciSequence) {
		int invalidFibonacci = -1;
		int currentIndex = 2;
		long currentValue = 0;
		List<Long> sequence = buildInitialSequence();
		while(currentValue < numberInFibonacciSequence){
			currentValue = sumOfPreviousTwoFibonacciNumbers(currentIndex, sequence);
			if(currentValue == numberInFibonacciSequence) {
				return currentIndex;
			}
			sequence.add(currentValue);
			currentIndex++;
		}
		return invalidFibonacci;
	}

	private long sumOfPreviousTwoFibonacciNumbers(int currentIndex, List<Long> sequence) {
		return sequence.get(currentIndex - 1) + sequence.get(currentIndex - 2);
	}

	private List<Long> buildInitialSequence() {
		List<Long> sequence = new ArrayList<Long>();
		sequence.addAll(Arrays.asList(new Long[]{0L,1L}));
		return sequence;
	}

}