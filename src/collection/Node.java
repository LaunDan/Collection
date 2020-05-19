package collection;

public class Node {
    private int value;
    private Node next;

    public Node(int number) {
        this.value = number;
    }

    public void setNext(Node node) {
        next = node;
    }

    public Node getNext() {
        return next;
    }

    public int getValue() {
        return value;
    }


}
