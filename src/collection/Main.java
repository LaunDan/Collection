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
        } else {
            last.setNext(node);
        }
        last = node;
        size++;
    }

    public void remove(int index) {
        if (index >= size)
            throw new IndexOutOfBoundsException("Index can't be bigger than " + size);
        if (index < 0)
            throw new IllegalArgumentException("Index can't be lower than 0.");
        if (index == 0) {
            first = first.getNext();
        } else {
            Node node = first;
            for (int i = 0; i < index - 1; i++) {
                node = node.getNext();
            }
            node.setNext(node.getNext().getNext());
            if (index == (size - 1)) {
                last = node;
            }
        }
        size--;
    }
}

