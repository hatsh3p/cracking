package TreesAndGraphs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Q4_CheckBalancedTest {
    BST unbalancedTree;
    BST balancedTree;

    @BeforeEach
    void setUp() {
        unbalancedTree = new BST();
        unbalancedTree.insert(12);
        unbalancedTree.insert(7);
        unbalancedTree.insert(18);
        unbalancedTree.insert(16);
        unbalancedTree.insert(25);
        unbalancedTree.insert(14);
        unbalancedTree.insert(20);
        unbalancedTree.insert(17);

        balancedTree = new BST();
        balancedTree.insert(12);
        balancedTree.insert(7);
        balancedTree.insert(3);
        balancedTree.insert(8);
        balancedTree.insert(18);
        balancedTree.insert(16);
        balancedTree.insert(25);
        balancedTree.insert(14);
        balancedTree.insert(20);
        balancedTree.insert(17);
    }

    @Test
    void isBalanced_Unbalanced_False() {
        Assertions.assertFalse(Q4_CheckBalanced.isBalanced(unbalancedTree.root));
    }

    @Test
    void isBalanced_Balanced_True() {
        Assertions.assertTrue(Q4_CheckBalanced.isBalanced(balancedTree.root));
    }

    @Test
    void isBalanced2_Unbalanced_False() {
        Assertions.assertFalse(Q4_CheckBalanced.isBalanced2(unbalancedTree.root));
    }

    @Test
    void isBalanced2_Balanced_True() {
        Assertions.assertTrue(Q4_CheckBalanced.isBalanced2(balancedTree.root));
    }
}