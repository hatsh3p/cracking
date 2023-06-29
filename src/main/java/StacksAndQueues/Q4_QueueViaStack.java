package StacksAndQueues;

import java.util.EmptyStackException;

/**
 * Problem: Implement a Queue class which implements a queue using two stacks.
 */
public class Q4_QueueViaStack {
    /**
     * Solution 1: In my initial attempt, I wasn't sure WHEN to start popping
     * from the first stack and pushing into the second stack.
     */
    public static class TwoStackQueue {
        private Stack<Integer> stack1 = new Stack<>();
        private Stack<Integer> stack2 = new Stack<>();
        int size = 0;

        public void push(int item) {
            ++size;
            stack1.push(item);
            if (size > 1) {
                while(!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
        }

        public int pop() {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            if (stack2.isEmpty()) {
                throw new EmptyStackException();
            }
            return stack2.pop();
        }

        public String toString() {
            return stack2.toString();
        }
    }

    /**
     * Solution 2: CTCI
     */
    public static class MyQueue<T> {
        Stack<T> stackNewest, stackOldest;

        public MyQueue() {
            stackNewest = new Stack<T>();
            stackOldest = new Stack<T>();
        }

        public int size() {
            return stackNewest.size() + stackOldest.size();
        }

        public void add(T value) {
            // Push onto stackNewest, which always has the newest element on top.
            stackNewest.push(value);
        }

        /* Move elements from stackNewest into stackOldest. This is usually done
         * so that we can do operations on stack Oldest.
         */
        private void shiftStacks() {
            if (stackOldest.isEmpty()) {
                while(!stackNewest.isEmpty()) {
                    stackOldest.push(stackNewest.pop());
                }
            }
        }

        public T peek() {
            shiftStacks();
            return stackOldest.peek(); // Retrieves the oldest item.
        }

        public T remove() {
            shiftStacks();
            return stackOldest.pop(); // Pop the oldest item.
        }

        public String toString() {
            shiftStacks();
            return stackOldest.toString();
        }

    }

    public static void main(String[] args) {
        TwoStackQueue queue = new TwoStackQueue();
        queue.push(1);
        queue.push(3);
        queue.push(5);
        // 1, 3, 5
        //System.out.println(queue.toString());
        //queue.pop();
        // 1, 3
        //System.out.println(queue.toString());
        //queue.push(7);
        // 1, 3, 7
       // System.out.println(queue.toString());

        MyQueue<Integer> queue2 = new MyQueue<>();
        queue2.add(1);
        queue2.add(3);
        queue2.add(5);
        System.out.println(queue2);

    }
}
