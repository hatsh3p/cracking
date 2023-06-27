package LinkedLists;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Problem: Implement a function to check if a linked list is a palindrome.
 * Inputs:                      Outputs:
 * h->a->n->n->a->h             "true"
 * b->a->n->a->n->a             "false"
 */
public class Q6_Palindrome {
    /**
     * Solution 1: Assume doubly linked list and no additional DS.
     * This solution is too trivial; the question is probably intended for a
     * singly linked list.
     *
     * Time Complexity:         O(N)
     * Space Complexity:        O(1)
     */
    public static boolean isPalindrome(LinkedList<Character> list) {
        int start = 0;
        int end = list.size() - 1;
        while (start < end) {
            if (list.get(start) != list.get(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    /**
     * Solution 2: Reverse and Compare.
     */
    public static boolean isPalindrome2(Node head) {
        Node reversed = reverseAndClone(head);
        return isEqual(head, reversed);
    }
    public static Node reverseAndClone(Node node) {
        Node reversedHead = null;
        while (node != null) {
            Node n = new Node(node.data); // clone
            n.next = reversedHead;
            reversedHead = n;
            node = node.next;
        }
        return reversedHead;
    }
    public static boolean isEqual(Node list1, Node list2) {
        while (list1 != null && list2 != null) {
            if (list1.data != list2.data) {
                return false;
            }
            list1 = list1.next;
            list2 = list2.next;
        }
        if (list1 != null || list2 != null) {
            return false;
        }
        return true;
    }

    /**
     * Solution 3: Iterative approach with Stack.
     * Use a stack to reverse the front half of the list.
     * Use two runners, one to add to the stack and one to determine length/2
     * of the linked list (and thus stop adding to the stack).
     */
    public static boolean isPalindrome3(Node node) {
        Node slow = node;
        Node fast = node;
        // Stack contains first half of the string in reverse order.
        Stack<Integer> stack = new Stack<>();

        // Had to write this while loop because it was not getting the last
        // element.
        while (fast != null && fast.next != null) {
            stack.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }

        // Deal with odd number of elements.
        if (fast != null) { // Exited to fast.next == null but fast != null.
            slow = slow.next; // Skips odd element.
        }

        // Compare stack to second half of the string.
        for (int i = 0; i < stack.size(); i++) {
            int data = stack.pop();
            if (slow.data != data) {
                return false;
            }
            slow = slow.next;
        }
        return true;
    }


    /**
     * Solution 4: Recursive approach. Skipped.
     */
}
