package ArraysAndStrings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static ArraysAndStrings.Q6_StringCompression.compressBad;
import static ArraysAndStrings.Q6_StringCompression.compressBetter;
import static org.junit.jupiter.api.Assertions.*;

class Q6_StringCompressionTest {

    @Test
    void compressBadTest1() {
        Assertions.assertEquals("c5", compressBad("ccccc"));
    }

    @Test
    void compressBadTest2() {
        Assertions.assertEquals("aab", compressBad("aab"));
    }

    @Test
    void compressBadTest3() {
        Assertions.assertEquals("a2b1c5a3", compressBad("aabcccccaaa"));
    }

    @Test
    void compressBetterTest1() {
        Assertions.assertEquals("c5", compressBetter("ccccc"));
    }

    @Test
    void compressBetterTest2() {
        Assertions.assertEquals("aab", compressBetter("aab"));
    }

    @Test
    void compressBetterTest3() {
        Assertions.assertEquals("a2b1c5a3", compressBetter("aabcccccaaa"));
    }
}