package LinkedLists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {
    Node list;
    @BeforeEach
    void setUp() {
        list = new Node(1);
        list.appendToTail(2);
        list.appendToTail(3);
        list.appendToTail(4);
    }

    @Test
    void size_List_Int() {
        Assertions.assertEquals(4, list.size());
    }
    @Test
    void toString_List_String() {
        Assertions.assertEquals("1 -> 2 -> 3 -> 4 -> null", list.toString());
    }
}