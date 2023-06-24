package ArraysAndStrings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static ArraysAndStrings.Q5_OneAway.*;
import static org.junit.jupiter.api.Assertions.*;

class Q5_OneAwayTest {

    @Test
    void isOneAwayTestTrue() {
        Assertions.assertTrue(isOneAway("team", "steam"));
    }

    @Test
    void isOneAwayTestFalse() {
        Assertions.assertFalse(isOneAway("dream", "team"));
    }

    @Test
    void oneEditReplaceTestTrue() {
        Assertions.assertTrue(oneEditReplace("bilbo", "bimbo"));
    }

    @Test
    void oneEditReplaceTestFalse() {
        Assertions.assertFalse(oneEditReplace("bilbo", "timbo"));
    }

    @Test
    void oneEditInsertTestTrue() {
        Assertions.assertTrue(oneEditInsert("bilbo", "blbo"));
    }

    @Test
    void oneEditInsertTestFalse() {
        Assertions.assertFalse(oneEditInsert("bilbo", "blmo"));
    }
}