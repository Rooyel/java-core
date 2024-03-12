package com.learning.core.day7;

class Stack {
    private static final int MAX_SIZE = 100;
    private String[] stackArray;
    private int top;

    public Stack() {
        this.stackArray = new String[MAX_SIZE];
        this.top = -1;
    }

    public void push(String element) {
        if (top == MAX_SIZE - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        stackArray[top] = element;
    }

    public String pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return null;
        }
        String poppedElement = stackArray[top];
        top--;
        return poppedElement;
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("Stack Elements:");
        for (int i = 0; i <= top; i++) {
            System.out.println(stackArray[i]);
        }
    }
}

public class D07P01 {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push("Hello");
        stack.push("world");
        stack.push("Java");
        stack.push("Programming");

        System.out.println("After Pushing 4 Elements:");
        stack.display();

        String poppedElement = stack.pop();
        System.out.println("After a Pop: " + poppedElement);

        stack.display();
    }
}


