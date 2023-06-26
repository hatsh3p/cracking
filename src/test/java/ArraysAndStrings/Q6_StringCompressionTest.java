package ArraysAndStrings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static ArraysAndStrings.Q6_StringCompression.compressBad;
import static ArraysAndStrings.Q6_StringCompression.compressBetter;
import static org.junit.jupiter.api.Assertions.*;

class Q6_StringCompressionTest {

    @Test
    void compressBad_String1_Compressed1() {
        Assertions.assertEquals("c5", compressBad("ccccc"));
    }

    @Test
    void compressBad_String2_String2() {
        Assertions.assertEquals("aab", compressBad("aab"));
    }

    @Test
    void compressBad_String3_Compressed3() {
        Assertions.assertEquals("a2b1c5a3", compressBad("aabcccccaaa"));
    }

    @Test
    void compressBetter_String1_Compressed1() {
        Assertions.assertEquals("c5", compressBetter("ccccc"));
    }

    @Test
    void compressBetter_String2_String2() {
        Assertions.assertEquals("aab", compressBetter("aab"));
    }

    @Test
    void compressBetter_String3_Compressed3() {
        Assertions.assertEquals("a2b1c5a3", compressBetter("aabcccccaaa"));
    }
}