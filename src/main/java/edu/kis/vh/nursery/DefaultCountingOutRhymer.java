package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int INT = 11;
    public static final int INT1 = -1;
    public static final int twelve = 12;
    private final int[] numbers = new int[twelve];

    private int total = INT1;

    protected void countIn(int in) {
        if (!isFull())
            getNumbers()[++total] = in;
    }


    protected boolean callCheck() {
        return total == INT1;
    }

    protected boolean isFull() {
        return total == INT;
    }

    protected int peekaboo() {
        if (callCheck())
            return INT1;
        return getNumbers()[total];
    }

    protected int countOut() {
        if (callCheck())
            return INT1;
        return getNumbers()[total--];
    }

    private int getTotal() {
        return total;
    }

    public int[] getNumbers() {
        return numbers;
    }

}
