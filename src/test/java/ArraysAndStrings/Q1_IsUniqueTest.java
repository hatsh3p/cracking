package ArraysAndStrings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static ArraysAndStrings.Q1_IsUnique.*;
import static org.junit.jupiter.api.Assertions.*;

class Q1_IsUniqueTest {
    @Test
    void isUnique_NonUniqueString_False() {
        assertFalse(isUnique("bilbo"));
    }

    @Test
    void isUnique_UniqueString_True() {
        assertTrue(isUnique("dog"));
    }

    @Test
    void isUniqueModified_NonUniqueString_False() {
        assertFalse(isUniqueModified("bilbo"));
    }

    @Test
    void isUniqueModified_UniqueString_True() {
        assertTrue(isUniqueModified("dog"));
    }

    @Test
    void isUniqueNoAdditionalDS_NonUniqueString_False() {
        assertFalse(isUniqueNoAdditionalDS("bilbo"));
    }

    @Test
    void testIsUniqueNoAdditionalDS_NonUniqueString_True() {
        assertTrue(isUniqueNoAdditionalDS("dog"));
    }
}