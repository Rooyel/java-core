package com.learning.core.day8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class D08P05 {
    public static Queue<Integer>[] splitQueue(Queue<Integer> inputQueue) {
        Queue<Integer> oddQueue = new LinkedList<>();
        Queue<Integer> evenQueue = new LinkedList<>();

        while (!inputQueue.isEmpty()) {
            int num = inputQueue.poll();
            if (num % 2 == 0) {
                evenQueue.offer(num);
            } else {
                oddQueue.offer(num);
            }
        }

        Queue<Integer>[] result = (Queue<Integer>[]) new Queue[2];
        result[0] = oddQueue;
        result[1] = evenQueue;

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> inputQueue = new LinkedList<>();

        System.out.println("Enter the elements of the queue separated by spaces: ");
        String input = scanner.nextLine();
        String[] elements = input.split("\\s+");

        for (String element : elements) {
            inputQueue.offer(Integer.parseInt(element));
        }

        Queue<Integer>[] result = splitQueue(inputQueue);

        System.out.println("Odd Queue: " + result[0]);
        System.out.println("Even Queue: " + result[1]);

        scanner.close();
    }
}
