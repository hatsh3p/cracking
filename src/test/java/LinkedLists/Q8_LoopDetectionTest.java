package LinkedLists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static LinkedLists.Q8_LoopDetection.*;

class Q8_LoopDetectionTest {
    Node cycleList;
    Node cycleFirstNode;
    Node cycleLastNode;
    Node noCycleList;

    @BeforeEach
    void setUp() {
        // 1 -> 2 -> 3 -> 4 -> 5
        //           ^----------
        cycleList = new Node(1);
        cycleList.appendToTail(2);
        cycleFirstNode = new Node(3);
        cycleList.appendToTail(cycleFirstNode);
        cycleList.appendToTail(4);
        cycleLastNode = new Node(5);
        cycleList.appendToTail(cycleLastNode);
        cycleLastNode.appendToTail(cycleFirstNode);

        noCycleList = new Node(1);
        noCycleList.appendToTail(2);
        noCycleList.appendToTail(1);
        noCycleList.appendToTail(2);
    }

    @Test
    void detectLoop_List_CycleStart() {
        Assertions.assertEquals(cycleFirstNode, detectLoop(cycleList));
    }

    @Test
    void detectCycle_List_True() {
        Assertions.assertTrue(detectCycle(cycleList));
    }

    @Test
    void detectCycle_List_False() {
        Assertions.assertFalse(detectCycle(noCycleList));
    }

    @Test
    void getCycleStart_List_CycleStart() {
        Assertions.assertEquals(cycleFirstNode, getCycleStart(cycleList));
    }

    @Test
    void getCycleStart_List_Null() {
        Assertions.assertNull(getCycleStart(noCycleList));
    }
}