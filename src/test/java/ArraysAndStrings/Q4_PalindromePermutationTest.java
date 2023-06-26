package ArraysAndStrings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static ArraysAndStrings.Q4_PalindromePermutation.*;
import static org.junit.jupiter.api.Assertions.*;

class Q4_PalindromePermutationTest {

    @Test
    void isPermutationOfPalindrome_Palindrome_True() {
        Assertions.assertTrue(isPermutationOfPalindrome("Tact coa"));
    }

    @Test
    void isPermutationOfPalindrome_NonPalindrome_False() {
        Assertions.assertFalse(isPermutationOfPalindrome("Tac coa"));
    }

    @Test
    void getCharpoint_Letter_Number() {
        Assertions.assertEquals(0, getCharpoint('a'));
    }

    @Test
    void getCharpoint_Invalid_Negative1() {
        Assertions.assertEquals(-1, getCharpoint(' '));
    }

    @Test
    void isPermutationOfPalindrome2_Palindrome_True() {
        Assertions.assertTrue(isPermutationOfPalindrome2("Tact coa"));
    }

    @Test
    void isPermutationOfPalindrome2_NonPalindrome_False() {
        Assertions.assertFalse(isPermutationOfPalindrome2("Tac coa"));
    }
}