package LinkedLists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static LinkedLists.Q1_RemoveDups.removeDups;
import static LinkedLists.Q1_RemoveDups.removeDupsUsingSet;
import static org.junit.jupiter.api.Assertions.*;

class Q1_RemoveDupsTest {
    Node list1;
    Node list2;
    @BeforeEach
    void setUp() {
        list1 = new Node(1);
        list1.appendToTail(2);
        list1.appendToTail(1);
        list1.appendToTail(3);
        list1.appendToTail(2);

        list2 = new Node(1);
        list2.appendToTail(2);
        list2.appendToTail(3);
    }
    @Test
    void removeDups_DupsList_NoDupsList() {
        removeDups(list1);
        assertEquals(list2.toString(), list1.toString());
    }

    @Test
    void removeDupsUsingSet_DupsList_NoDupsList() {
        removeDupsUsingSet(list1);
        assertEquals(list2.toString(), list1.toString());
    }
}