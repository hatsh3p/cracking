package ArraysAndStrings;

/**
 * Problem: Implement an algorithm to determine if a string has all unique characters.
 *      Input:       Output:
 *      "cat"        "true"
 *      "bib"        "false"
 */
public class Q1_IsUnique {
    /**
     * Solution 1
     *
     *      Time Complexity:     O(N)
     *      Space Complexity:    O(N)
     */
    public static boolean isUnique(String str) {
        int[] codepoints = new int[128]; // Represents the ASCII character set.
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i); // 'A' = 41.
            codepoints[c]++;
        }
        for (int i = 0; i < codepoints.length; i++) {
            if (codepoints[i] > 1) {
                return false;
            }
        }
        return true;
    }

    /**
     * Solution 2: Based on CTCI Solution 1.
     *
     *      Time Complexity:     O(N)
     *      Space Complexity:    O(N)
     */
    public static boolean isUniqueModified(String str) {
        if (str.length() > 128) { // Early exit.
            return false;
        }

        boolean[] codepoints = new boolean[128]; // Represents the ASCII character set.

        // Use boolean instead in int.
        // Check the current value to allow for early exit instead of looping again.
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i); // 'A' = 41.
            if (codepoints[c] == true) {
                return false;
            } else {
                codepoints[c] = true;
            }
        }

        return true;
    }

    /**
     * Solution 3: No additional data structures.
     *
     *      Time Complexity:     O(N**2)
     *      Space Complexity:    O(1)
     */
    public static boolean isUniqueNoAdditionalDS(String str) {
        if (str.length() > 128) { // Early exit.
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }

        return true;
    }
}
