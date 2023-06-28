package StacksAndQueues;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {
    Queue<Integer> queue;

    @BeforeEach
    void setUp() {
        queue = new Queue<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
    }

    @Test
    void add() {
        queue.add(4);
        Assertions.assertEquals("FRONT -> 1 -> 2 -> 3 -> 4 -> BACK", queue.toString());
    }

    @Test
    void remove() {
        Assertions.assertEquals(1, queue.remove());
    }

    @Test
    void peek() {
        Assertions.assertEquals(1, queue.peek());
    }

    @Test
    void isEmpty() {
        Assertions.assertFalse(queue.isEmpty());
    }

    @Test
    void testToString() {
        Assertions.assertEquals("FRONT -> 1 -> 2 -> 3 -> BACK", queue.toString());
    }
}