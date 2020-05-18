package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Main{

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.addFirst(6);
        list.addLast(10);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
    }

}
