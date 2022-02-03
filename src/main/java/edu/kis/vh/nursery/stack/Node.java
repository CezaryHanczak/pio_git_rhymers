package edu.kis.vh.nursery.stack;

// TODO: klasa jest nieużywana i nietestowana, trzeba dopisać testy jednostkowe
/**
 *  Element listy dwukierunkowej, posiadający wartość liczbową int
 */
public class Node {

    private int value;
    private Node prev;
    private Node next;

    /**
     * Konstruktor ustawiajacy pole value elementu
     * @param i wartość do ustawienia
     */
    protected Node(int i) {
        this.value = i;
    }

    /**
     * Motoda zwraca wartość elementu
     * @return wartość elementu
     */
    public int getValue() {
        return value;
    }

    /**
     * Metoda zwracająca poprzedni element listy
     * @return poprzedni obiekt listy
     */
    public Node getPrev() {
        return prev;
    }

    /**
     * Metoda ustawiająca następny element listy
     */
    public void setPrev(Node prev) {
        this.prev = prev;
    }

    /**
     * Metoda zwracająca następny element listy
     * @return nastepny obiekt listy
     */
    public Node getNext() {
        return next;
    }

    /**
     * Metoda ustawiająca następny element listy
     */
    public void setNext(Node next) {
        this.next = next;
    }
}
