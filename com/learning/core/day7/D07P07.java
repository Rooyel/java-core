package com.learning.core.day7;


import java.util.Stack;

public class D07P07 {
    public static boolean isTopElementEven(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return false;
        }

        int topElement = stack.peek();
        return topElement % 2 == 0;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(15);
        stack.push(25);
        stack.push(30);
        stack.push(49);

        boolean isEven = isTopElementEven(stack);
        System.out.println(isEven);
    }
}
