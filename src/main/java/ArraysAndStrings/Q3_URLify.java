package ArraysAndStrings;

/**
 * Problem: Write a method to replace all spaces in a string w/ '%20'.
 * Assume the string has sufficient space AND you are given the "true" length of
 * the string.
 * If using Java, use a character array in place
 *      Input:              Output:
 *      "Mr John Smith"     "Mr%20John%20Smith"
 */
public class Q3_URLify {
    /**
     * Solution 1
     *
     *      Time Complexity:     O(?)
     *      Space Complexity:    O(?)
     */
    public static String replaceSpaces(String str, int strLength) {
        char[] arr = str.toCharArray();
        int spaceCount = 0;
        for (int i = 0; i < strLength; i++) {
            if (arr[i] == ' ') {
                ++spaceCount;
            }
        }
        int totalLength = strLength + spaceCount * 2;
        int strPointer = strLength - 1;
        for (int i = totalLength - 1; i >= 0; i--) {
            if (arr[strPointer] == ' ') {
                arr[i] = '0';
                arr[i - 1] = '2';
                arr[i - 2] = '%';
                i = i - 2;
            } else {
                arr[i] = arr[strPointer];
            }
            strPointer--;
        }
        return String.valueOf(arr);
    }
}
