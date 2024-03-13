package com.learning.core.day8;
import java.util.Scanner;

class Node
{
    int value;
    Node next;

    public Node(int data)
    {
        this.value = data;
        this.next = null;
    }
}

public class D08P02 {
    Node front, rear;

    public void enqueue(int data)
    {
        if(front == null)
        {
            rear = new Node(data);
            front = rear;
        }
        else{
            Node newNode = new Node(data);
            rear.next = newNode;
            rear = newNode;
        }
    }
    public int dequeue()
    {
        int res;
        if(front == null)
        {
            System.out.println("Queue is Empty");
            return -1;
        }
        else
        {
            res = front.value;
            front = front.next;
            return res;
        }
    }

    public void display() {
        Node temp = this.front;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size of the queue");
        // int size = sc.nextInt();
        D08P02 lq = new D08P02();
        System.out.println("Enter 5 queue elements");
        for (int i=1; i<=5; i++)
        {
            lq.enqueue(sc.nextInt());
        }
        System.out.println("Elements in queue: ");
        lq.display();

        System.out.println("after removing two elements: ");
        for (int i=1; i<=2; i++)
        {
            lq.dequeue();
        }
        lq.display();
    }
}
