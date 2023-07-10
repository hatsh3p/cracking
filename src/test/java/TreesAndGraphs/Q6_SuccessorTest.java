package TreesAndGraphs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Q6_SuccessorTest {
    BST tree;
    TreeNode node12 = new TreeNode(12);
    TreeNode node7 = new TreeNode(7);
    TreeNode node3 = new TreeNode(3);
    TreeNode node8 = new TreeNode(8);
    TreeNode node18 = new TreeNode(18);
    TreeNode node16 = new TreeNode(16);
    TreeNode node25 = new TreeNode(25);
    TreeNode node14 = new TreeNode(14);
    TreeNode node20 = new TreeNode(20);
    TreeNode node17 = new TreeNode(17);
    TreeNode node4 = new TreeNode(4);


    @BeforeEach
    void setUp() {
        tree = new BST();
        tree.insert(node12);
        tree.insert(node7);
        tree.insert(node3);
        tree.insert(node8);
        tree.insert(node18);
        tree.insert(node16);
        tree.insert(node25);
        tree.insert(node14);
        tree.insert(node20);
        tree.insert(node17);
        tree.insert(node4);
    }

    @Test
    void inOrderSuccessor_3_4() {
        Assertions.assertEquals(node4, Q6_Successor.inOrderSuccessor(node3));
    }

    @Test
    void inOrderSuccessor_7_8() {
        Assertions.assertEquals(node8, Q6_Successor.inOrderSuccessor(node7));
    }

    @Test
    void inOrderSuccessor_18_20() {
        Assertions.assertEquals(node20, Q6_Successor.inOrderSuccessor(node18));
    }

    @Test
    void inOrderSuccessor_12_16() {
        Assertions.assertEquals(node16, Q6_Successor.inOrderSuccessor(node12));
    }

    @Test
    void inOrderSuccessor_16_17() {
        Assertions.assertEquals(node17, Q6_Successor.inOrderSuccessor(node16));
    }
}