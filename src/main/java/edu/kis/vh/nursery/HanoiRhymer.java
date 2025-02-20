package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    public static final int INT2 = 0;
    private int totalRejected = INT2;

    protected int reportRejected() {
        return getTotalRejected();
    }

    @Override
    protected void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            setTotalRejected(getTotalRejected() + 1);
        else
            super.countIn(in);
    }

    public int getTotalRejected() {
        return totalRejected;
    }

    private void setTotalRejected(int totalRejected) {
        this.totalRejected = totalRejected;
    }
}
