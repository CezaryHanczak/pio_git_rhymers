package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int SIZE = 11;
    public static final int EMPTY = -1;
    public static final int REAL_SIZE = SIZE + 1;
    private final int[] numbers = new int[REAL_SIZE];

    private int total = EMPTY;

    protected void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }


    protected boolean callCheck() {
        return total == EMPTY;
    }

    protected boolean isFull() {
        return total == SIZE;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY;
        return numbers[total];
    }

    protected int countOut() {
        if (callCheck())
            return EMPTY;
        return numbers[total--];
    }
}
