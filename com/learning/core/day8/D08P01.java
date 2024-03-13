package com.learning.core.day8;
import java.util.Scanner;

class Queue
{
    int front = -1;
    int rear = -1;
    int arr[];
    int n;

    public Queue(int n)
    {
        this.n = n;
        arr = new int[n];
    }

    public boolean isFull()
    {
        return rear == n-1;
    }

    public boolean isEmpty()
    {
        return front == -1 && rear == -1;
    }

    public void enqueue(int data)
    {
        if(isFull())
        {
            System.out.println("Queue is full");
        }
        else if(isEmpty())
        {
            rear = front = 0;
            arr[rear] = data;
        }
        else{
            rear++;
            arr[rear] = data;
        }
    }

    public int dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return -1;
        }
        else if(front == rear)
        {
            int top = arr[front];
            front = rear = -1;
            return top;
        }
        else{
            int top = arr[front];
            front++;
            return top;
        }
    }
    public void display() {
        for (int i = this.front; i <= this.rear; i++) {
            System.out.print(this.arr[i] + " ");
        }
        System.out.println();
    }
}

public class D08P01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Queue");
        int n = sc.nextInt();

        Queue q1 = new Queue(n);

        System.out.println("Enter the queue elements");
        while(!q1.isFull())
        {
            q1.enqueue(sc.nextInt());
        }
        System.out.print("Elements in Queue: ");
        q1.display();
        System.out.print("After removing the first element: ");
        q1.dequeue();
        q1.display();


    }
}
