package StacksAndQueues;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EmptyStackException;

public class Q5_SortedStack {
    /**
     * Solution 1: I created a stack that keeps the minimum element on top.
     * The "sorting" is built-in.
     *
     * CTCI instead uses a simpler approach: Write a sorting algorithm for
     * stacks. Will return to this after reviewing sorting algorithms.
     **/
    public static class SortedStack {
        private class StackNode {
            private int data;
            private StackNode next;

            public StackNode(int data) {this.data = data; }
        }

        private StackNode min;

        public SortedStack() {
            this.min = null;
        }

        public void push(int item) {
            StackNode node = new StackNode(item);
            if (min == null) {
                node.next = null;
                min = node;
            } else if (item < min.data) {
                node.next = min;
                min = node;
            } else {
                StackNode beforeLargerNode = getFirstNodeBeforeLargerNode(item);
                StackNode largerNode = beforeLargerNode.next;
                beforeLargerNode.next = node;
                node.next = largerNode;
            }
        }

        private StackNode getFirstNodeBeforeLargerNode(int item) {
            StackNode current = min;
            StackNode previous = null;
            while (current.data < item) {
                current = current.next;
                if (previous != null) {
                    previous = previous.next;
                }
            }
            return previous;
        }

        public int pop() {
            if (min == null) throw new EmptyStackException();
            int item = min.data;
            min = min.next;
            return item;
        }

        public int peek() {
            if (min == null) throw new EmptyStackException();
            return min.data;
        }

        public boolean isEmpty() {
            return min == null;
        }


        public String toString() {
            if (this.isEmpty()) { return ""; }
            StringBuilder strBuilder = new StringBuilder();
            strBuilder.append("TOP -> ");
            ArrayList<Integer> temp = new ArrayList<>();
            while (this.min != null) {
                int item = this.pop();
                strBuilder.append(item);
                strBuilder.append(" -> ");
                temp.add(item);
            }
            strBuilder.append("BOTTOM");
            Collections.reverse(temp);
            SortedStack recreateStack = new SortedStack();
            for (int item: temp) {
                recreateStack.push(item);
            }
            this.min = recreateStack.min;
            return strBuilder.toString();
        }
    }

    public static void main(String[] args) {
        System.out.println("hiii");
        SortedStack stack = new SortedStack();
        stack.push(4);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
    }
}
