package LinkedLists;

import java.util.HashSet;

/**
 * Problem: Write code to remove duplicates from an unsorted linked list.
 * Follow up: How would you solve this if a temporary buffer is not allowed.
 *      Input:                  Output:
 *      1->2->1->3->2           1->2->3
 */
public class Q1_RemoveDups {
    /**
     * Solution 1: In-place algorithm.
     *
     * Time complexity:         O(N**2)
     * Space complexity:        O(1)
     *
     */
    public static void removeDups(Node node) {
        Node slow = node;
        Node fast = node.next;
        Node fastPrev = node;
        while (slow != null) {
            fastPrev = slow;
            fast = slow.next;
            while (fast != null) {
                if (slow.data == fast.data) {
                    // Delete fast node.
                    fastPrev.next = fast.next;
                }
                fastPrev = fast;
                fast = fast.next;
            }
            slow = slow.next;
        }
    }

    /**
     * Solution 2: If minimizing runtime is more important than space
     * complexity, we can use a set to store the elements encountered.
     *
     * Time complexity:         O(N)
     * Space complexity:        O(N)
     */
    public static void removeDupsUsingSet(Node node) {
        HashSet<Integer> elements = new HashSet<>();
        Node current = node;
        Node previous = null;
        while (current != null) {
            if (elements.contains(current.data)) {
                previous.next = current.next;
            } else {
                elements.add(current.data);
            }
            previous = current;
            current = current.next;
        }
    }
}
