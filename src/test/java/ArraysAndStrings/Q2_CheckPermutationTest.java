package ArraysAndStrings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static ArraysAndStrings.Q2_CheckPermutation.isPermutation;
import static org.junit.jupiter.api.Assertions.*;

class Q2_CheckPermutationTest {

    @Test
    void isPermutation_Permutation_True() {
        Assertions.assertTrue(isPermutation("bat", "tab"));
    }

    @Test
    void isPermutation_NotPermutation_False() {
        Assertions.assertFalse(isPermutation("cat", "tab"));
    }
}