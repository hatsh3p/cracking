package ImplementDataStructures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {
    SinglyLinkedList<Integer> list;

    @BeforeEach
    void setUp() {
        list = new SinglyLinkedList<>();
        list.addHead(1);
        list.addTail(2);
        list.addTail(3);
    }

    @Test
    void toStringTest() {
        Assertions.assertEquals("head -> 1 -> 2 -> 3 -> tail", list.toString());
    }

    @Test
    void toArrayTest() {
        Assertions.assertArrayEquals(new Object[] {1, 2, 3}, list.toArray());
    }

    @Test
    void addHeadTest() {
        list.addHead(4);
        Assertions.assertArrayEquals(new Object[] {4, 1, 2, 3}, list.toArray());
    }

    @Test
    void addTailTest() {
        list.addTail(4);
        Assertions.assertArrayEquals(new Object[] {1, 2, 3, 4}, list.toArray());
    }

    @Test
    void insertTest() {
        list.insert(2,2);
        Assertions.assertArrayEquals(new Object[] {1, 2, 2, 3}, list.toArray());
    }

    @Test
    void getPosTest() {
        Assertions.assertEquals(3, list.getPosition(2));
    }

    @Test
    void getItemTest() {
        list.addTail(4);
        Assertions.assertEquals(4, list.getItem(4));
    }

    @Test
    void removeHead() {
        Assertions.assertEquals(1, list.removeHead());
    }

    @Test
    void removeTail() {
        Assertions.assertEquals(3, list.removeTail());
    }

    @Test
    void removeTailUntilHead() {
        list.removeTail();
        list.removeTail();
        Assertions.assertEquals(1, list.removeTail());
    }
    @Test
    void removeTailUntilNull() {
        list.removeTail();
        list.removeTail();
        list.removeTail();
        Assertions.assertNull(list.removeTail());
    }

    @Test
    void delete() {
    }

    @Test
    void testDelete() {
    }

    @Test
    void size() {
    }

    @Test
    void isEmpty() {
    }
}