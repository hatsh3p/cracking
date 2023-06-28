package LinkedLists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static LinkedLists.Q7_Intersection.getIntersection;
import static LinkedLists.Q7_Intersection.getIntersection2;
import static org.junit.jupiter.api.Assertions.*;

class Q7_IntersectionTest {
    Node list1;
    Node list2;
    Node node3;

    @BeforeEach
    void setUp() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        node3 = new Node(3);
        Node node4 = new Node(4);
        Node node9 = new Node(9);
        list1 = node1;
        list1.appendToTail(node2);
        list1.appendToTail(node3);
        list1.appendToTail(node4);

        list2 = node9;
        list2.appendToTail(node3);
    }
    @Test
    void getIntersection_Lists_Node() {
        Assertions.assertEquals(node3, getIntersection(list1, list2));
    }

    @Test
    void getIntersection2_Lists_Node() {
        Assertions.assertEquals(node3, getIntersection2(list1, list2));
    }
}