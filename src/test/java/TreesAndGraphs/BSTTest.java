package TreesAndGraphs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BSTTest {
    BST bst;
    @BeforeEach
    void setUp() {
        bst = new BST();
        bst.insert(50);
        bst.insert(17);
        bst.insert(76);
        bst.insert(23);
        bst.insert(9);
        bst.insert(54);
    }

    @Test
    void find_9_True() {
        Assertions.assertTrue(bst.find(9));
    }

    @Test
    void find_10_False() {
        Assertions.assertFalse(bst.find(10));
    }

    @Test
    void inOrderTraversalTest() {
        // Expected: 9 17 23 50 54 76
        bst.inOrderTraversal();
    }

    @Test
    void preOrderTraversalTest() {
        // Expected: 50 17 76 9 23 54
        bst.preOrderTraversal();
    }

    @Test
    void postOrderTraversalTest() {
        // Expected: 9 23 17 54 76 50
        bst.postOrderTraversal();
    }

    @Test
    void remove() {
        bst.remove(23);
        bst.inOrderTraversal();
    }


}