package com.learning.core.day7;

import java.util.Stack;

public class D07P06 {
    static class MinStack {
        Stack<Integer> stack;
        Stack<Integer> minStack;

        public MinStack() {
            stack = new Stack<>();
            minStack = new Stack<>();
        }

        public void push(int x) {
            stack.push(x);
            if (minStack.isEmpty() || x <= minStack.peek()) {
                minStack.push(x);
            }
        }

        public void pop() {
            if (stack.isEmpty())
                return;

            int poppedElement = stack.pop();
            if (poppedElement == minStack.peek()) {
                minStack.pop();
            }
        }

        public int top() {
            if (!stack.isEmpty())
                return stack.peek();
            return -1; // Return -1 if stack is empty
        }

        public int getMin() {
            if (!minStack.isEmpty())
                return minStack.peek();
            return -1; // Return -1 if minStack is empty
        }
    }
    public static void main(String[] args) {
        MinStack stack = new MinStack();

        int[] input = {16, 15, 29, 19, 18};

        for (int num : input) {
            stack.push(num);
        }

        System.out.println("Minimum element: " + stack.getMin());
    }
}