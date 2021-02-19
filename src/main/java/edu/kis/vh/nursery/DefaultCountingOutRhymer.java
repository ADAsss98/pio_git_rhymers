package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int TAB_SIZE = 12;
	private static final int LAST_TABLE_INDEX = TAB_SIZE -1;
	private static int INITIAL = -1;
	private static final int RETURN_VALUE = -1;
	private final int[] numbers = new int[TAB_SIZE];

	public int getInitial() {
		return INITIAL;
	}

	protected void countIn(int in) {
		if (!isFull())
			numbers[++INITIAL] = in;
	}

	protected boolean callCheck() {
			return INITIAL == RETURN_VALUE;
		}

	protected boolean isFull() {
			return INITIAL == LAST_TABLE_INDEX;
		}

	protected int peekaboo() {
		if (callCheck()) {
			return RETURN_VALUE;
		} else {
			return numbers[INITIAL];
		}
	}

	protected int countOut() {
		if (callCheck()) {
			return RETURN_VALUE;
		} else {
			return numbers[INITIAL--];
		}
	}

}
