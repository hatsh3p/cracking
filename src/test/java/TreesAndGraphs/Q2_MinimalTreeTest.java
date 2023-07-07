package TreesAndGraphs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q2_MinimalTreeTest {
    int[] array;
    BST bst;

    @BeforeEach
    void setUp() {
        array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    }

    @Test
    void createMinimalBST_Arr_BST() {
        BSTNode root = Q2_MinimalTree.createMinimalBST(array);
        bst = new BST(root);
        bst.preOrderTraversal();
    }

}