package LinkedLists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static LinkedLists.Q5_SumLists.sumLists;
import static org.junit.jupiter.api.Assertions.*;

class Q5_SumListsTest {
    Node list1;
    Node list2;
    Node list3;

    @BeforeEach
    void setUp() {
        list1 = new Node(7);
        list1.appendToTail(1);
        list1.appendToTail(6);

        list2 = new Node(5);
        list2.appendToTail(9);
        list2.appendToTail(2);

        list3 = new Node(2);
        list3.appendToTail(1);
        list3.appendToTail(9);
    }

    @Test
    void sumLists_Lists_ResultList() {
        Node result = sumLists(list1, list2);
        Assertions.assertEquals(list3.toString(), result.toString());
    }
}