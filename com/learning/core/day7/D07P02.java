package com.learning.core.day7;

class Node {
    double data;
    Node next;

    public Node(double data) {
        this.data = data;
        this.next = null;
    }
}

class Stack0 {
    private Node top;

    public Stack0() {
        this.top = null;
    }

    public void push(double data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    public double pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return Double.MIN_VALUE;
        }
        double poppedElement = top.data;
        top = top.next;
        return poppedElement;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.print("The elements of the stack are: ");
        Node current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

}

public class D07P02 {
    public static void main(String[] args) {
        Stack0 stack = new Stack0();

        // Pushing elements onto the stack
        stack.push(10.0);
        stack.push(20.0);
        stack.push(30.0);
        stack.push(40.0);

        // Displaying elements of the stack
        stack.display();

        // Popping an element from the stack
        stack.pop();
        stack.pop();

        // Displaying elements after popping
        stack.display();
    }
}
