package ArraysAndStrings;
/**
 * Problem: There are three types of edits that can be performed on a string:
 * (1) Insert a char.
 * (2) Delete a char.
 * (3) Replace a char.
 * Given 2 strings, write a function to check if they are 0 or 1 edits away from ==.
 *      Input:              Output:
 *      "pale", "ple"       "true"
 *      "pales", "pale"     "true"
 *      "pale", "bake"      "false"
 */
public class Q5_OneAway {
    /**
     * Solution 1:
     * (1) Create a counter for counting the number of differences between the strings.
     * (2) When a diff is found, check if the next char is the same.
     * (3) If the number of diff > 1, return false.
     * Messy and buggy solution.
     */
    public static boolean oneEditAway(String str1, String str2) {
        int diffCount = 0;
        int p1 = 0, p2 = 0;
        int length = str2.length();

        if (str1.length() != str2.length()) {
            boolean isLonger = isLongerString(str1, str2);
            if (isLonger) {
                length = str1.length();
            }
            diffCount++;
        }

        while (p1 < length) {
            if (str1.charAt(p1) != str2.charAt(p2)) {
                ++diffCount;
                if (str1.charAt(p1 + 1) == str2.charAt(p2)) {
                    ++p1;
                } else if (str1.charAt(p1) == str2.charAt(p2 + 1)) {
                    ++p2;
                } else if (str1.charAt(p1 + 1) == str2.charAt(p2 + 1)) {
                    ++p1;
                    ++p2;
                } else {
                        ++diffCount;
                }
            }
            ++p1;
            ++p2;
        }
        return diffCount <= 1;

    }

    public static boolean isLongerString(String str1, String str2) {
        return str1.length() > str2.length();
    }

    /**
     * Solution 2: Implementing the first CTCI solution
     * (only peeking at the function headers...)
     * Replacement means that
     *      (1) lengths are the same
     *      (2) there is only one character that is different.
     * Insertion and deletion mean that
     *      (1) lengths are off by one
     *      (2) all characters are the same.
     * In this solution, there are two subfunctions:
     *      (1) boolean oneEditReplace(String s1, String s2)
     *      (2) boolean oneEditInsert(String s1, String s2)
     */

    public static boolean isOneAway(String s1, String s2) {
        if (s1.length() == s2.length()) {
            return oneEditReplace(s1, s2);
        } else if (s1.length() > s2.length()) {
            return oneEditInsert(s1, s2);
        } else {
            return oneEditInsert(s2, s1);
        }
    }

    public static boolean oneEditReplace(String s1, String s2) {
        int diffCount = 0;
        int j = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(j)) {
                diffCount++;
                if (diffCount > 1) {
                    return false;
                }
            }
            j++;
        }
        return true;
    }

    public static boolean oneEditInsert(String longerStr, String shorterStr) {
        if (longerStr.length() - shorterStr.length() > 1) { // Early exit
            return false;
        }
        int diffCount = 0;
        int j = 0;
        for (int i = 0; i < shorterStr.length(); i++) {
            while (shorterStr.charAt(i) != longerStr.charAt(j)) {
                ++diffCount;
                ++j;
                if (diffCount > 1) {
                    return false;
                }
            }
            ++j;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(oneEditAway("pale", "fale"));
    }

}
