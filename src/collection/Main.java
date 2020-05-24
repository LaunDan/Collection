package collection;


import java.sql.Array;

public class Main {

    private String[] queueArray;
    private int queueSize;
    private int front, rear, numberOfItems = 0;

    Main(int size) {
        queueSize = size;
        queueArray = new String[size];
        Array.fill(queueArray, "-1");

    }

    public static void main(String[] args) {

    }

}

