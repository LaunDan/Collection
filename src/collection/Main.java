package collection;


public class Main {

    private Node first;
    private Node last;
    private int size;

    public Main() {
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public void add(int number) {
        Node node = new Node(number);
        if (isEmpty()) {
            first = node;
            last = node;
        } else {
            last.setNext(node);
            last = node;
        }
        size++;
    }
}

