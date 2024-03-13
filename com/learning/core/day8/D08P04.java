package com.learning.core.day8;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class D08P04 {
    public static String checkQueueEmpty(Queue<String> queue) {
        if (queue.isEmpty()) {
            return "Empty";
        } else {
            return "Not Empty";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> queue = new LinkedList<>();

        System.out.println("Enter the elements of the queue separated by spaces: ");
        String input = scanner.nextLine().trim(); // Trim any leading/trailing spaces

        if (input.isEmpty()) {
            System.out.println("Output:");
            System.out.println("Empty");
        } else {
            String[] elements = input.split("\\s+");

            for (String element : elements) {
                queue.offer(element);
            }

            System.out.println("Output:");
            System.out.println(checkQueueEmpty(queue));
        }

        scanner.close();
    }
}