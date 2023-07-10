package TreesAndGraphs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q5_ValidateBSTTest {
    TreeNode validBSTRoot;
    TreeNode invalidBSTRoot;

    @BeforeEach
    void setUp() {
        validBSTRoot.key = 12;
        validBSTRoot.left.key = 7;
        validBSTRoot.right.key = 18;
        validBSTRoot.left.left.key = 3;
        validBSTRoot.left.right.key = 8;
        validBSTRoot.right.left.key = 14;
        validBSTRoot.right.right.key = 19;

        invalidBSTRoot.key = 12;
        invalidBSTRoot.left.key = 7;
        invalidBSTRoot.right.key = 18;
        invalidBSTRoot.left.left.key = 13;
        invalidBSTRoot.left.right.key = 8;
        invalidBSTRoot.right.left.key = 14;
        invalidBSTRoot.right.right.key = 19;
    }

    @Test
    void validBST_Valid_True() {
        Assertions.assertTrue(Q5_ValidateBST.checkBST(validBSTRoot));
    }

    @Test
    void validBST_Invalid_False() {
        Assertions.assertFalse(Q5_ValidateBST.checkBST(invalidBSTRoot));
    }
}