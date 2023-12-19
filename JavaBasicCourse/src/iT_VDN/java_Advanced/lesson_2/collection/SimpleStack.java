/**
 * java advanced
 * lesson 2
 *
 * @version 1.0 from 2023-11-29
 * @author Valentyn Mozul
 */

package iT_VDN.java_Advanced.lesson_2.collection;

public class SimpleStack {
    private int maxSize;
    private long[] stackArray;
    private int top;

    public SimpleStack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new long[maxSize];
        this.top = -1;
    }

    public void push(long element) {
        stackArray[++top] = element;
    }

    public long pop() {
        return stackArray[top--];
    }


    public long peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

class StackMain {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        SimpleStack simpleStack = new SimpleStack(10);
        simpleStack.push(10);
        simpleStack.push(20);
        simpleStack.push(30);
//        System.out.println(simpleStack.pop());
//        System.out.println(simpleStack.pop());
//        System.out.println(simpleStack.pop());
//        System.out.println(simpleStack.peek());
//        System.out.println(simpleStack.isEmpty());

        isEmpty(simpleStack);
    }

    private static void isEmpty(SimpleStack simpleStack) {
        while (!simpleStack.isEmpty()) {
            long popElement = simpleStack.pop();
            System.out.println(popElement + " ");
        }
    }
}