package ArraysAndStrings;
/**
 * Problem: Implement a method to perform basic string compression using the
 * counts of repeated characters:
 * Constraints:
 *      - characters are A-Za-z
 * Exceptions:
 *      - If the compressed string is longer than the original, return original.
 *
 *      Input:              Output:
 *      "aabcccccaaaa"      "a2b1c5a3"
 *      "ccccc"             "c5"
 *      "aab"               "aab"   because "a2b1" is longer than original string.
 */
public class Q6_StringCompression {
    /**
     * Solution 1: I won't type out my original solution. It used a character array
     * and broke down the problem into two subfunctions:
     * (1) replaceRepeats(char[] arr)
     * (2) removeSpacesAndAddOnes(char[] arr)
     * I abandoned this solution because it got overly complicated and the first function
     * was getting into O(N**2) time complexity.
     */

    /**
     * String v. StringBuilder
     *
     * Strings are immutable.
     * This means that whenever we concatenate Strings, we are actually creating a new String.
     * And since String concatenation involves coping each String character by character,
     * we create a new String for every character that is copied. Very expensive.
     * O(N**2)
     *
     * StringBuilder is mutable.
     * It creates a resizable array that can be appended to. Think of it as similar to ArrayList.
     * Adding (or concatenating) to it just adds to the array.
     * O(1) if just adding one char.
     * O(N) where N is the length of the String.
     */
    /**
     * Solution 2: CTCI Brute Force / Bad Compression
     * This solution creates a new string everytime the substring of consecutive characters ends.
     * Worst case this would occur for the length of the string.
     *      Time Complexity:     O(p + k**2)
     *      Space Complexity:    O(k) ? b/c a new string is created at the end of each char seq.
     */
    public static String compressBad(String str) {
        String compressedString = "";
        int countConsecutive = 0;
        for (int i = 0; i < str.length(); i++) {
            ++countConsecutive;
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressedString += "" + str.charAt(i) + countConsecutive;
                countConsecutive = 0;
            }
        }
        return compressedString.length() < str.length() ? compressedString : str;
    }

    /**
     * Solution 3: Replace string concatenation with StringBuilder.
     *
     *      Time Complexity:     O(N) where N is the length of the string.
     *      Space Complexity:    O()
     */
    public static String compressBetter(String str) {
        StringBuilder compressedString = new StringBuilder();
        int countConsecutive = 0;
        for (int i = 0; i < str.length(); i++) {
            ++countConsecutive;
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressedString.append(str.charAt(i));
                compressedString.append(countConsecutive);
                countConsecutive = 0;
            }
        }
        return compressedString.length() < str.length() ? compressedString.toString() : str;
    }
}
