package ArraysAndStrings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static ArraysAndStrings.Q3_URLify.replaceSpaces;

class Q3_URLifyTest {
    @Test
    void replaceSpacesTest1() {
        Assertions.assertEquals("Mr%20John%20Smith", replaceSpaces("Mr John Smith    ", 13));
    }

    @Test
    void replaceSpacesTest2() {
        Assertions.assertEquals("Mr%20%20John%20Smith", replaceSpaces("Mr  John Smith      ", 14));
    }
}