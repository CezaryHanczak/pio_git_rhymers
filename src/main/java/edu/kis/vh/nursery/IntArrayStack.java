package edu.kis.vh.nursery;

public class IntArrayStack implements IntArrayStackInterface {
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
