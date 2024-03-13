package com.learning.core.day8;

public class D08P03 {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public D08P03(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + item);
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = item;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int item = queue[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        int i = front;
        while (i != rear) {
            System.out.print(queue[i] + " ");
            i = (i + 1) % capacity;
        }
        System.out.println(queue[rear]);
    }

    public static void main(String[] args) {
        D08P03 circularQueue = new D08P03(4);
        circularQueue.enqueue(14);
        circularQueue.enqueue(13);
        circularQueue.enqueue(22);
        circularQueue.enqueue(-8);

        System.out.println("Elements in circular queue:");
        circularQueue.display();

        System.out.println("After removing first element:");
        circularQueue.dequeue();
        circularQueue.display();
    }
}
