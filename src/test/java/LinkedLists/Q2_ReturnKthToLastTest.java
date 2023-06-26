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
    void getKthToLast_K5_List() {
        Assertions.assertEquals(1, getKthToLast(list, 5));
    }

    @Test
    void getKthToLast_K2_List() {
        Assertions.assertEquals(4, getKthToLast(list, 2));
    }

    @Test
    void getKthToLast_K1_List() {
        Assertions.assertEquals(5, getKthToLast(list, 1));
    }

    @Test
    void getKthToLast_TooLargeK_Negative1() {
        Assertions.assertEquals(-1, getKthToLast(list, 6));
    }

    @Test
    void getKthToLast_TooSmallK_Negative1() {
        Assertions.assertEquals(-1, getKthToLast(list, 0));
    }

    @Test
    void getKthToLastOptimal_K5_List() {
        Assertions.assertEquals(1, getKthToLastOptimal(list, 5));
    }

    @Test
    void getKthToLastOptimal_K2_List() {
        Assertions.assertEquals(4, getKthToLastOptimal(list, 2));
    }

    @Test
    void getKthToLastOptimal_K1_List() {
        Assertions.assertEquals(5, getKthToLastOptimal(list, 1));
    }

    @Test
    void getKthToLastOptimal_TooLargeK_Negative1() {
        Assertions.assertEquals(-1, getKthToLastOptimal(list, 6));
    }

    @Test
    void getKthToLastOptimal_TooSmallK_Negative1() {
        Assertions.assertEquals(-1, getKthToLastOptimal(list, 0));
    }


}