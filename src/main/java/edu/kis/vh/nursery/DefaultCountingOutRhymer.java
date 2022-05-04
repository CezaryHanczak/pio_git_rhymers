package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntArrayStack;

public class DefaultCountingOutRhymer {
    private IntArrayStack intArrayStack;

    public DefaultCountingOutRhymer() {
        this.intArrayStack = new IntArrayStack();
    }

    public DefaultCountingOutRhymer(IntArrayStack intArrayStack) {
        this.intArrayStack = intArrayStack;
    }

    protected void countIn(int in) {
        intArrayStack.countIn(in);
    }

    public boolean callCheck() {
        return intArrayStack.callCheck();
    }


    public boolean isFull() {
        return intArrayStack.isFull();
    }

    protected int peekaboo() {
        return intArrayStack.peekaboo();
    }

    protected int countOut() {
        return intArrayStack.countOut();
    }
}
