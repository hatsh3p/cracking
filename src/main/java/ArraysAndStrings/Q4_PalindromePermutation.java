package ArraysAndStrings;

/**
 * Problem: Given a string, check if it is permutation of a palindrome.
 * Initially, I didn't understand what this meant. This means, could the letters be rearranged
 * into a palindrome hence **permutation** of a palindrome.
 *      Input:              Output:
 *      "Tact coa"          "true"          palindromes: "taco cat", "atco cta"
 *
 * To be a palindrome:
 * (1) if Even, same # of each character.
 * (2) if Odd, same # of each character EXCEPT one character can appear once.
 */
public class Q4_PalindromePermutation {
    /**
     * Solution 1:
     * (1) Get length and determine if even.
     * (2) Create an array of size 26 to store # of chars.
     * (3) Go through and count letters.
     * (4) If odd and more than one char has an odd count, return false.
     * (5) If even and at least one char has an odd count, return false.
     * (6) Return true.
     *      Time Complexity:     O(N)
     *      Space Complexity:    O(26) = O(1)
     */
    static boolean isPermutationOfPalindrome(String str) {
        int trueLength = 0;
        int[] letters = new int[26];

        for (int i = 0; i < str.length(); i++ ) {
            int index = getCharpoint(str.charAt(i));
            if (index != -1) {
                letters[index]++;
                trueLength++;
            }
        }
        boolean singleOddFound = false;
        boolean isEven = trueLength % 2 == 0;

        for (int letter: letters) {
            if (letter % 2 != 0) {
                if (isEven || singleOddFound) {
                    return false;
                } else {
                    singleOddFound = true;
                }
            }
        }
        return true;
    }

    static int getCharpoint(char c) {
        if (c >= 65 && c <= 90) { // Uppercase A-Z
            return c - 65;
        } else if (c >= 97 && c <= 122) { // Lowercase a-z
            return c - 97;
        } else {
            return -1;
        }
    }

    /**
     * Solution 2: Effectively the same thing as Solution 1 algorithmically.
     * Based on CTCI solution.
     * Just organized into 4 different functions.
     *
     * (1) boolean isPermutationOfPalindrome2(String phrase)
     * (2) boolean checkMaxOneOdd(int[] table)
     * (3) int getCharpoint(char c) -- REUSED FROM ABOVE
     * (4) int[] buildCharFrequencyTable(String phrase)
     */
    static boolean isPermutationOfPalindrome2(String phrase) {
        int[] table = buildCharFrequencyTable(phrase);
        return checkMaxOneOdd(table);
    }

    static boolean checkMaxOneOdd(int[] table) {
        int oddCount = 0;
        for (int n: table) {
            if (n % 2 != 0) {
                ++oddCount;
            }
        }
        return oddCount == 1;
    }

    static int[] buildCharFrequencyTable(String phrase) {
        int[] table = new int[26];
        for (int i = 0; i < phrase.length(); i++) {
            int index = getCharpoint(phrase.charAt(i));
            if (index != -1) {
                table[index] += 1;
            }
        }
        return table;
    }
}
