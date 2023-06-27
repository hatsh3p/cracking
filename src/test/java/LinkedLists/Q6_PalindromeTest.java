package LinkedLists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static LinkedLists.Q6_Palindrome.*;

class Q6_PalindromeTest {
    LinkedList<Character> trueList;
    LinkedList<Character> falseList;

    Node list1;
    Node list2;

    @BeforeEach
    void setUp() {
        trueList = new LinkedList<>();
        trueList.add('h');
        trueList.addLast('a');
        trueList.addLast('n');
        trueList.addLast('n');
        trueList.addLast('a');
        trueList.addLast('h');

        list1 = new Node('h');
        list1.appendToTail('a');
        list1.appendToTail('n');
        list1.appendToTail('n');
        list1.appendToTail('a');
        list1.appendToTail('h');

        falseList = new LinkedList<>();
        falseList.add('b');
        falseList.addLast('a');
        falseList.addLast('n');
        falseList.addLast('a');
        falseList.addLast('n');
        falseList.addLast('a');

        list2 = new Node('b');
        list2.appendToTail('a');
        list2.appendToTail('n');
        list2.appendToTail('a');
        list2.appendToTail('n');
        list2.appendToTail('a');
    }

    @Test
    void isPalindrome_PalindromeList_True() {
        Assertions.assertTrue(isPalindrome(trueList));
    }

    @Test
    void isPalindrome_PalindromeList_False() {
        Assertions.assertFalse(isPalindrome(falseList));
    }

    @Test
    void isPalindrome2_PalindromeList_True() {
        Assertions.assertTrue(isPalindrome2(list1));
    }

    @Test
    void isPalindrome2_PalindromeList_False() {
        Assertions.assertFalse(isPalindrome2(list2));
    }

    @Test
    void isPalindrome3_PalindromeList_True() {
        Assertions.assertTrue(isPalindrome3(list1));
    }

    @Test
    void isPalindrome3_PalindromeList_False() {
        Assertions.assertFalse(isPalindrome3(list2));
    }
}