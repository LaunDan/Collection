package collection;


import java.util.Arrays;

public class Main {

    private String[] queueArray;
    private int queueSize;
    private int front, rear, numberOfItems = 0;

    Main(int size) {
        queueSize = size;
        queueArray = new String[size];
        Arrays.fill(queueArray, "-1");

    }

    public void insert(String input) {
        if (numberOfItems + 1 <= queueSize) {
            queueArray[rear] = input;
            rear++;
            numberOfItems++;
            System.out.println("INSERT " + input + " was added to the queue\n");

        } else {
            System.out.println("Sorry but queue is full!");

        }
    }

    public void remove() {
        if (numberOfItems > 0) {
            System.out.println("REMOVE " + queueArray[front] + " was removed from queue.");
            queueArray[front] = "-1";
            front++;
            numberOfItems--;
        } else {
            System.out.println("Sorry but queue is empty!");

        }
    }

    public void peek() {
        System.out.println("The first element is " + queueArray[front]);

    }


    public static void main(String[] args) {
        Main theQueue = new Main(10);
        theQueue.insert("10");
        theQueue.insert("11");
        theQueue.insert("16");
        theQueue.insert("29");

        theQueue.displayTheQueue();
    }

}

