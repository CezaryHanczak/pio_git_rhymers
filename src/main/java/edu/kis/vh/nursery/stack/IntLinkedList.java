package edu.kis.vh.nursery.stack;

// TODO: klasa jest nieużywana i nietestowana, trzeba dopisać testy jednostkowe
public class IntLinkedList implements IntLinkedListInterface {

    private Node last;

    public IntLinkedList(Node last) {
        this.last = last;
    }

    private void push(int i) {
        if (getLast() == null)
            setLast(new Node(i));
        else {
            getLast().setNext(new Node(i));
            getLast().getNext().setPrev(getLast());
            setLast(getLast().getNext());
        }
    }

    private boolean isEmpty() {
        return getLast() == null;
    }

    private boolean isFull() {
        return false;
    }

    private int top() {
        if (isEmpty())
            return -1;
        return getLast().getValue();
    }

    private int pop() {
        if (isEmpty())
            return -1;
        int ret = getLast().getValue();
        setLast(getLast().getPrev());
        return ret;
    }

    @Override
    public Node getLast() {
        return last;
    }

    @Override
    public void setLast(Node last) {
        this.last = last;
    }

}
