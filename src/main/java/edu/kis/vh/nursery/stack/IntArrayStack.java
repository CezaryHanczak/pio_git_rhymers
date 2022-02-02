package edu.kis.vh.nursery.stack;

public class IntArrayStack implements IntArrayStackInterface {
    private final int[] numbers = new int[REAL_SIZE];

    private int total = EMPTY;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }


    public boolean callCheck() {
        return total == EMPTY;
    }

    public boolean isFull() {
        return total == SIZE;
    }

    public int peekaboo() {
        if (callCheck())
            return EMPTY;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY;
        return numbers[total--];
    }
}
