package collection;


public class Main {

    private Node first;
    private Node last;
    private int size;

    public Main() {
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return (size == 0);
    }
}

