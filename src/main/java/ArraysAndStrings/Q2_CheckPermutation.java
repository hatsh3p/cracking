package ArraysAndStrings;

import java.util.HashMap;

/**
 * Problem: Given two strings write a method to check if one string is a permutation of the other.
 *      Input:              Output:
 *      "tab" "bat"         "true"
 *      "cat" "bat"         "false"
 */
public class Q2_CheckPermutation {
    /**
     * Solution 1:
     * When check for a permutation, we are checking for the same character count in each string.
     * Easy thing to do is check if the strings are the same length.
     * Next, we want to loop through each string and count the number of times a letter shows up.
     */
    public static boolean isPermutation (String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        // Create a map for each string and then loop through each string to populate the map.
        HashMap<Character, Integer> map1 = populateMap(str1);
        HashMap<Character, Integer> map2 = populateMap(str2);

        // If the maps are == return true, else return false;
        return map1.equals(map2);
    }

    public static HashMap<Character, Integer> populateMap(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.containsKey(c)) {
                int n = map.get(c);
                map.put(c, n + 1);
            } else {
                map.put(c, 1);
            }
        }
        return map;
    }
}
