package StacksAndQueues;

import java.util.EmptyStackException;

/**
 * Problem: Describe how you could use a single array to implement three
 * stacks.
 */
public class Q1_ThreeInOne {
    /**
     * Solution 1: Too many variables, can simplify.
     */
    public class ThreeStacks {
        private class StackNode {
            private int data;
            private StackNode next;
            public StackNode(int data) { this.data = data; }
        }

        private int[] arr;
        private int stack1Top;
        private int stack1Start;
        private int stack1End;
        private int stack2Top;
        private int stack2Start;
        private int stack2End;
        private int stack3Top;
        private int stack3Start;
        private int stack3End;

        public ThreeStacks(int arrSize) {
            arr = new int[arrSize];
            stack1Start = 0;
            stack1End = arrSize / 3;
            stack2Start = stack1End + 1;
            stack2End = stack2Start + arrSize / 3;
            stack3Start = stack3End + 1;
            stack3End = arrSize - 1;
            stack1Top = stack1Start;
            stack2Top = stack2Start;
            stack3Top = stack3Start;
        }

        public void push(int stack, int data) {
            if (stack == 1) {
                arr[stack1Top] = data;
                ++stack1Top;
            } else if (stack == 2) {
                arr[stack2Top] = data;
                ++stack2Top;
            } else {
                arr[stack3Top] = data;
                ++stack3Top;
            }
        }

        public int pop(int stack) {
            return 1;
        }
    }
    /**
     * Solution 2: CTCI
     */
    public class FixedMultiStack {
        private int numberOfStacks = 3;
        private int stackCapacity;
        private int[] values;
        private int[] sizes;

        public FixedMultiStack(int stackSize) {
            stackCapacity = stackSize;
            values = new int[stackSize * numberOfStacks];
            sizes = new int[numberOfStacks];
        }

        /* Push value onto stack. */
        public void push(int stackNum, int value) {
            if (isFull(stackNum)) {
                return;
            }
            // Increment the stack pointer and then update the top value.
            sizes[stackNum]++;
            values[indexOfTop(stackNum)] = value;
        }

        /* Pop item from top stack. */
        public int pop(int stackNum) {
            if (isEmpty(stackNum)) {
                throw new EmptyStackException();
            }
            int topIndex = indexOfTop(stackNum);
            int value = values[topIndex]; // Get top.
            values[topIndex] = 0; // Clear top.
            sizes[stackNum]--;
            return value;
        }

        /* Return top element. */
        public int peek(int stackNum) {
            if (isEmpty(stackNum)) {
                throw new EmptyStackException();
            }
            return values[indexOfTop(stackNum)];
        }

        public boolean isEmpty(int stackNum) {
            return sizes[stackNum] == 0;
        }

        public boolean isFull(int stackNum) {
            return sizes[stackNum] == stackCapacity;
        }

        private int indexOfTop(int stackNum) {
            int offset = stackNum * stackCapacity;
            int size = sizes[stackNum];
            return offset + size - 1;
        }
    }
}
