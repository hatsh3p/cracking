package StacksAndQueues;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

/**
 * Problem: Implement a data structure SetOfStacks composed of several stacks.
 * It should create a new stack once the previous one exceeds capacity.
 * SetOfStacks.push() and SetOfStacks.pop() should behave identically to a
 * single stack.
 * Follow up: Implement a function popAt(int Index).
 */
public class Q3_StackOfPlates {
    public class SetOfStacks {
        List<Stack> stacks;
        int stackCap;
        public SetOfStacks(int stackCap) {
            this.stackCap = stackCap;
            this.stacks = new ArrayList<>();
        }

        public void push(int v) {
            Stack<Integer> last = stacks.get(stacks.size() - 1);
            if (last != null && !last.isFull()) {
                last.push(v);
            } else {
                Stack<Integer> stack = new Stack(stackCap);
                stack.push(v);
                stacks.add(stack);
            }
        }

        public int pop() {
            Stack<Integer> last = stacks.get(stacks.size() - 1);
            if (last == null) throw new EmptyStackException();
            int v = last.pop();
            if (last.size() == 0) stacks.remove(stacks.size() - 1);
            return v;
        }
    }

    /**
     * Follow up: Trickier.
     * You can implement this as a "rollover" system where everytime an element
     * is popped all of the elements on top of it get moved one space.
     * See pg. 235.
     */
}
