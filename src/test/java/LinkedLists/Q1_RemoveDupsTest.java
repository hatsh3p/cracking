package LinkedLists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static LinkedLists.Q1_RemoveDups.removeDups;
import static org.junit.jupiter.api.Assertions.*;

class Q1_RemoveDupsTest {

    @Test
    void removeDupsTest() {
        Node list1 = new Node(1);
        list1.appendToTail(2);
        list1.appendToTail(1);
        list1.appendToTail(3);
        list1.appendToTail(2);
        removeDups(list1);

        Node list2 = new Node(1);
        list2.appendToTail(2);
        list2.appendToTail(3);
        assertEquals(list2.toString(), list1.toString());
    }
}