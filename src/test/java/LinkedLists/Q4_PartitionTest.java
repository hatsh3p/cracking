package LinkedLists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static LinkedLists.Q4_Partition.partition;
import static LinkedLists.Q4_Partition.partition2;
import static org.junit.jupiter.api.Assertions.*;

class Q4_PartitionTest {
    Node list1;
    Node list2;

    @BeforeEach
    void setUp() {
        list1 = new Node(3);
        list1.appendToTail(5);
        list1.appendToTail(8);
        list1.appendToTail(5);
        list1.appendToTail(10);
        list1.appendToTail(2);
        list1.appendToTail(1);

        list2 = new Node(1);
        list2.appendToTail(2);
        list2.appendToTail(3);
        list2.appendToTail(5);
        list2.appendToTail(8);
        list2.appendToTail(5);
        list2.appendToTail(10);
    }

    @Test
    void partition_List_PartitionedList() {
        Node head = partition2(list1, 5);
        Assertions.assertEquals(list2.toString(), head.toString());
    }
}