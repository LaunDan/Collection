package collection;


import java.util.Arrays;

public class Main {

    private String[] stackArray;
    private int stackSize;
    private int topOfStack = -1;

    void TheStack(int size) {
        stackSize = size;
        stackArray = new String[size];
        Arrays.fill(stackArray, "-1");

    }

    public void push(String input) {
        if (topOfStack + 1 < stackSize) {
            topOfStack++;
            stackArray[topOfStack] = input;
        } else System.out.println("Sorry but the stack is full");
        displayTheStack();
        System.out.println("PUSH " + input + " Was added to the stack");

    }

    

    public static void main(String[] args) {

    }

}

