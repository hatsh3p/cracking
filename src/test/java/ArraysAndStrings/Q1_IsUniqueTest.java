package ArraysAndStrings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static ArraysAndStrings.Q1_IsUnique.*;
import static org.junit.jupiter.api.Assertions.*;

class Q1_IsUniqueTest {
    @Test
    void testIsUniqueFalse() {
        assertFalse(isUnique("bilbo"));
    }

    @Test
    void testIsUniqueTrue() {
        assertTrue(isUnique("dog"));
    }

    @Test
    void testIsUniqueModifiedFalse() {
        assertFalse(isUniqueModified("bilbo"));
    }

    @Test
    void testIsUniqueModifiedTrue() {
        assertTrue(isUniqueModified("dog"));
    }

    @Test
    void testIsUniqueNoAdditionalDSFalse() {
        assertFalse(isUniqueNoAdditionalDS("bilbo"));
    }

    @Test
    void testIsUniqueNoAdditionalDSTrue() {
        assertTrue(isUniqueNoAdditionalDS("dog"));
    }
}