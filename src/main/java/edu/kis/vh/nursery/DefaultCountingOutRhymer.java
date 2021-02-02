package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int TAB_SIZE = 12;
	private static final int TOTAL = 11;
	private static final int INITIAL = -1;
	private static final int RETURN = -1;
	private final int[] numbers = new int[TAB_SIZE];

	public int total = INITIAL;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
			return total == INITIAL;
		}
		
	public boolean isFull() {
			return total == TOTAL;
		}

	protected int peekaboo() {
		if (callCheck()) {
			return RETURN;
		} else {
			return numbers[total];
		}
	}

	public int countOut() {
		if (callCheck()) {
			return RETURN;
		} else {
			return numbers[total--];
		}
	}

}
