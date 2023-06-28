package StacksAndQueues;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    Stack<Integer> stack;

    @BeforeEach
    void setUp() {
         stack = new Stack<>();
         stack.push(1);
         stack.push(2);
         stack.push(3);
    }

    @Test
    void pop() {
        Assertions.assertEquals(3, stack.pop());
    }

    @Test
    void push() {
        stack.push(4);
        Assertions.assertEquals("TOP -> 4 -> 3 -> 2 -> 1 -> BOTTOM", stack.toString());
    }

    @Test
    void peek() {
        Assertions.assertEquals(3, stack.peek());
    }

    @Test
    void isEmpty() {
        Assertions.assertFalse(stack.isEmpty());
    }

    @Test
    void testToString() {
        Assertions.assertEquals("TOP -> 3 -> 2 -> 1 -> BOTTOM", stack.toString());
    }
}