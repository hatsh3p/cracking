package LinkedLists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static LinkedLists.Q2_ReturnKthToLast.*;
import static org.junit.jupiter.api.Assertions.*;

class Q2_ReturnKthToLastTest {
    Node list;

    @BeforeEach
    void setUp() {
        list = new Node(1);
        list.appendToTail(2);
        list.appendToTail(3);
        list.appendToTail(4);
        list.appendToTail(5);
    }

    @Test
    void getKthToLastFirstTest() {
        Assertions.assertEquals(1, getKthToLast(list, 5));
    }

    @Test
    void getKthToLastSecondToLastKTest() {
        Assertions.assertEquals(4, getKthToLast(list, 2));
    }

    @Test
    void getKthToLastLastKTest() {
        Assertions.assertEquals(5, getKthToLast(list, 1));
    }

    @Test
    void getKthToLastInvalidKTest1() {
        Assertions.assertEquals(-1, getKthToLast(list, 6));
    }

    @Test
    void getKthToLastInvalidKTest2() {
        Assertions.assertEquals(-1, getKthToLast(list, 0));
    }

    @Test
    void getKthToLastOptimalFirstTest() {
        Assertions.assertEquals(1, getKthToLastOptimal(list, 5));
    }

    @Test
    void getKthToLastOptimalSecondToLastKTest() {
        Assertions.assertEquals(4, getKthToLastOptimal(list, 2));
    }

    @Test
    void getKthToLastOptimalLastKTest() {
        Assertions.assertEquals(5, getKthToLastOptimal(list, 1));
    }

    @Test
    void getKthToLastOptimalInvalidKTest1() {
        Assertions.assertEquals(-1, getKthToLastOptimal(list, 6));
    }

    @Test
    void getKthToLastOptimalInvalidKTest2() {
        Assertions.assertEquals(-1, getKthToLastOptimal(list, 0));
    }


}