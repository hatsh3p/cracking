package ArraysAndStrings;

/**
 * Problem: Assume you have a method isSubstring which checks if a word is a substring
 * of another. Given two strings, s1 and s2, write code to check if s2 is a rotation
 * of s1 using only one call to is substring.
 *      Input:                           Output:
 *      "waterbottle", "erbottlewat"     "true"
 */
public class Q9_StringRotation {
    /**
     * Solution 1: My solution without looking at CTCI.
     * CTCI solution in this case was more complicated than necessary,
     * so I will not include it for now.
     *
     *      Time Complexity:     O(N)
     *      Space Complexity:    O(1)
     */
    public static boolean isRotation (String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        int i = 0;
        for (int j = 0; j < str2.length(); j++) {
            if (str2.charAt(j) != str1.charAt(i)) {
                ++j;
            } else {
                String sub = str2.substring(0, j - 1);
                if (!str1.contains(sub)) {
                    return false;
                }
            }
        }
        return true;
    }
}
