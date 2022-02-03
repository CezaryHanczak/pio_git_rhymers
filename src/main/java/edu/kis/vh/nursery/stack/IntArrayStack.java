package edu.kis.vh.nursery.stack;

public class IntArrayStack implements IntStackInterface {
    private final int SIZE = 12;
    private final int REAL_SIZE = SIZE + 1;
    private final int[] numbers = new int[REAL_SIZE];

    private int total;

    public IntArrayStack() {
        this.total = EMPTY;
    }

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
            return RETURN_EMPTY_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return RETURN_EMPTY_VALUE;
        return numbers[total--];
    }
}
