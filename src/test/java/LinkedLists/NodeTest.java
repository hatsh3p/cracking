package LinkedLists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {
    @Test
    void toString_List_String() {
        Node list1 = new Node(1);
        list1.appendToTail(2);
        list1.appendToTail(1);
        list1.appendToTail(3);
        list1.appendToTail(2);
        Assertions.assertEquals("1 -> 2 -> 1 -> 3 -> 2 -> null", list1.toString());
    }
}