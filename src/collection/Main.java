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

    public void priorityInsert(String input) {
        int i;
        if (numberOfItems == 0) {
            insert(input);
        } else {
            for (i = numberOfItems - 1; i >= 0; i--) {
                if (Integer.parseInt(input) > Integer.parseInt(queueArray[i])) {
                    queueArray[i + 1] = queueArray[i];
                }else break;
            }

            queueArray[i+1]=input;
            rear++;
            numberOfItems++;
        }
    }

    public static void main(String[] args) {
        Main theQueue = new Main(10);
        theQueue.priorityInsert("19");
        theQueue.priorityInsert("11");
        theQueue.priorityInsert("10");
        theQueue.priorityInsert("29");

        theQueue.remove();

        theQueue.peek();

        theQueue.displayTheQueue();

        theQueue.insert("e4");

        theQueue.displayTheQueue();
    }

    public void displayTheQueue() {

        for (int n = 0; n < 61; n++) System.out.print("-");
        System.out.println();
        for (int n = 0; n < queueSize; n++) {
            System.out.format("| %2s " + " ", n);
        }
        System.out.println("|");
        for (int n = 0; n < 61; n++) System.out.print("-");
        System.out.println();
        for (int n = 0; n < queueSize; n++) {
            if (queueArray[n].equals("-1")) System.out.print("|     ");
            else System.out.print(String.format("| %2s " + " ", queueArray[n]));
        }
        System.out.println("|");
        for (int n = 0; n < 61; n++) System.out.print("-");
        System.out.println();
    }

}

