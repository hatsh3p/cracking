package LinkedLists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static LinkedLists.Q3_DeleteMiddleNode.deleteMiddleNode;
import static org.junit.jupiter.api.Assertions.*;

class Q3_DeleteMiddleNodeTest {
    Node list1;
    Node list2;
    Node middle;

    @BeforeEach
    void setUp() {
        list1 = new Node(1);
        list1.appendToTail(2);
        list1.appendToTail(3);
        list1.appendToTail(4);
        list1.appendToTail(5);

        list2 = new Node(1);
        list2.appendToTail(2);
        list2.appendToTail(4);
        list2.appendToTail(5);

        middle = list1;
        while (middle.data != 3) {
            middle = middle.next;
        }
    }

    @Test
    void deleteMiddleNodeTest() {
        deleteMiddleNode(middle);
        Assertions.assertEquals(list2.toString(), list1.toString());
    }
}