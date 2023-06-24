package ArraysAndStrings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static ArraysAndStrings.Q4_PalindromePermutation.*;
import static org.junit.jupiter.api.Assertions.*;

class Q4_PalindromePermutationTest {

    @Test
    void isPermutationOfPalindromeTestTrue() {
        Assertions.assertTrue(isPermutationOfPalindrome("Tact coa"));
    }

    @Test
    void isPermutationOfPalindromeTestFalse() {
        Assertions.assertFalse(isPermutationOfPalindrome("Tac coa"));
    }

    @Test
    void getCharpointTestA() {
        Assertions.assertEquals(0, getCharpoint('a'));
    }

    @Test
    void getCharpointTestSpace() {
        Assertions.assertEquals(-1, getCharpoint(' '));
    }

    @Test
    void isPermutationOfPalindrome2TestTrue() {
        Assertions.assertTrue(isPermutationOfPalindrome2("Tact coa"));
    }

    @Test
    void isPermutationOfPalindrome2TestFalse() {
        Assertions.assertFalse(isPermutationOfPalindrome2("Tac coa"));
    }
}