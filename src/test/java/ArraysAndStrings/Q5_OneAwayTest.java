package ArraysAndStrings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static ArraysAndStrings.Q5_OneAway.*;
import static org.junit.jupiter.api.Assertions.*;

class Q5_OneAwayTest {

    @Test
    void isOneAway_String_True() {
        Assertions.assertTrue(isOneAway("team", "steam"));
    }

    @Test
    void isOneAway_String_False() {
        Assertions.assertFalse(isOneAway("dream", "team"));
    }

    @Test
    void oneEditReplace_String_True() {
        Assertions.assertTrue(oneEditReplace("bilbo", "bimbo"));
    }

    @Test
    void oneEditReplace_String_False() {
        Assertions.assertFalse(oneEditReplace("bilbo", "timbo"));
    }

    @Test
    void oneEditInsert_String_True() {
        Assertions.assertTrue(oneEditInsert("bilbo", "blbo"));
    }

    @Test
    void oneEditInsert_String_False() {
        Assertions.assertFalse(oneEditInsert("bilbo", "blmo"));
    }
}