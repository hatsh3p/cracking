package ArraysAndStrings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static ArraysAndStrings.Q9_StringRotation.isRotation;
import static org.junit.jupiter.api.Assertions.*;

class Q9_StringRotationTest {

    @Test
    void isRotation_String_True() {
        Assertions.assertTrue(isRotation("waterbottle", "erbottlewat"));
    }

    @Test
    void isRotation_String_False() {
        Assertions.assertFalse(isRotation("waterbottle", "erbomtlewat"));
    }
}