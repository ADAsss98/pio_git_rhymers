package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int TAB_SIZE = 12;
	private static final int TOTAL = 11;
	private static final int CHECK = -1;
	private int[] numbers = new int[TAB_SIZE];

	public int total = CHECK;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
			return total == -1;
		}
		
	public boolean isFull() {
			return total == TOTAL;
		}

	protected int peekaboo() {
		if (callCheck()) {
			return CHECK;
		} else {
			return numbers[total];
		}
	}

	public int countOut() {
		if (callCheck()) {
			return CHECK;
		} else {
			return numbers[total--];
		}
	}

}
