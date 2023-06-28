package StacksAndQueues;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EmptyStackException;

/**
 * Problem: How would you design a stack that has a function min() which
 * returns the minimum element? Push, pop, min should all operate in O(1).
 */
public class Q2_StackMin {
    /**
     * Solution 1: Add min to the Stack class.
     * This solution is too clunky and doesn't keep track of the min in O(1)
     * time when elements are popped off.
     */
    public static class StackNode {
        private int data;
        private StackNode next;
        public StackNode(int data) {this.data = data; }
    }

    private StackNode top;
    private StackNode min = null;

    public void push(int item) {
        StackNode node = new StackNode(item);
        node.next = top;
        top = node;
        if (item < min.data || min == null) {
            min = node;
        }
    }

    public int pop() {
        if (top == null) throw new EmptyStackException();
        int item = top.data;
        if (min == top) {
            min = null;
        }
        top = top.next;
        return item;
    }

    public int peek() {
        if (top == null) throw new EmptyStackException();
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public String toString(){
        if (this.isEmpty()) { return ""; }
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append("TOP -> ");
        ArrayList<Integer> temp = new ArrayList<>();
        while (this.top != null) {
            int item = this.pop();
            strBuilder.append(item);
            strBuilder.append(" -> ");
            temp.add(item);
        }
        strBuilder.append("BOTTOM");
        Collections.reverse(temp);
        Q2_StackMin recreateStack = new Q2_StackMin();
        for (int item: temp) {
            recreateStack.push(item);
        }
        return strBuilder.toString();
    }

    /**
     * Solution 2: Keep track of the minimum at each state. Have each node
     * record the minimum beneath itself. Thus, to find the minumum, you would
     * just check the min stored at the top node.
     * To implement this, just add an int min to the Node class.
     */
    public class StackWithMin extends Stack<NodeWithMin> {
        public void push(int value) {
            int newMin = Math.min(value, min());
            super.push(new NodeWithMin(value, newMin));
        }

        public int min() {
            if (this.isEmpty()) {
                return Integer.MAX_VALUE;
            } else {
                return peek().min;
            }
        }
    }
    class NodeWithMin {
        public int value;
        public int min;
        public NodeWithMin(int v, int min) {
            value = v;
            this.min = min;
        }
    }
    /**
     * Solution 3: Create an additional stack that keeps track of mins.
     * This solution is better than solution2 in the worst case where the min
     * is the first element pushed to the stack. In that case, we would keep
     * O(N) mins stored. In this case, we keep a very short stack.
     */
    public class StackWithMin2 extends Stack<Integer> {
        Stack<Integer> s2;
        public StackWithMin2() {
            s2 = new Stack<>();
        }
        public void push(int value) {
            if (value <= min()) {
                s2.push(value);
            }
            super.push(value);
        }

        public Integer pop() {
            int value = super.pop();
            if (value == min()) {
                s2.pop();
            }
            return value;
        }
        public int min() {
            if (s2.isEmpty()) {
                return Integer.MAX_VALUE;
            } else {
                return s2.peek();
            }
        }
    }
}
