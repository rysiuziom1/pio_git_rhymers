package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int MAX_SIZE = 12;
	private static final int UNDERFLOW_LIMIT = -1;
	private static final int ERROR = -1;
	private int[] numbers = new int[MAX_SIZE];

	public int total = -1;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
			return total == UNDERFLOW_LIMIT;
		}

	public boolean isFull() {
				return total == MAX_SIZE - 1;
			}

	protected int peekaboo() {
		if (callCheck())
			return ERROR;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return ERROR;
		return numbers[total--];
	}

}
