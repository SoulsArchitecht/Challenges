package ru.sshibko;

public class MyStack_9<T> {
    private T[] stackArray;
    private int top;

    public MyStack_9(int capacity) {
        stackArray = (T[]) new Object[capacity];
        top = -1;
    }

    public void push(T item) {
        if (top == stackArray.length - 1) {
            throw new IllegalStateException("Stack overflow");
        }
        stackArray[++top] = item;
    }

    public T pop() {
        if (top == -1) {
            throw new IllegalStateException("Stack underflow");
        }
        return stackArray[top--];
    }

    public T peek() {
        if (top == -1) {
            throw new IllegalStateException("Stack is Empty");
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }
}
