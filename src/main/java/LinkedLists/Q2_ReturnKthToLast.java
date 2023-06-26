package LinkedLists;
/**
 * Problem: Implement an algorithm to find the kth to last element
 * in a singly linked list.
 * Inputs:                  Outputs:
 * 1->2->3->4->5, k=2       4
 */
public class Q2_ReturnKthToLast {
    /**
     * Solution 1: Brute force.
     *
     * Time complexity:         O(N)
     * Space complexity:        O(1)
     */
    public static int getKthToLast(Node node, int k) {
        int length = 0;
        Node current = node;
        while (current != null) {
            ++length;
            current = current.next;
        }

        if (k > length || k <= 0) {
            return -1;
        }

        int iterations = length - k;
        current = node;
        for (int i = 0; i < iterations; i++) {
            current = current.next;
        }
        if (current != null) {
            return current.data;
        } else {
            return -1;
        }
    }

    /**
     * Solution 2: Recursive. CTCI solution.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    public static int printKthToLast(Node node, int k) {
        if (node == null) {
            return 0;
        }
        int index = printKthToLast(node.next, k) + 1;
        if (index == k) {
            System.out.println(k + "th to last node is " + node.data);
        }
        return index;
    }

    /**
     * Solution 3: Create a Wrapper Class to allow us to return a counter
     * and an index. Seems unnecessarily complicated. Skipped.
     */

    /**
     * Solution 4: Iterative. Most optimal but less straightforward.
     *
     * Time Complexity:
     * Space Complexity:
     *
     * Approach:
     * Use two pointers, p1 and p2.
     * Place the pointers k nodes apart in the linked list by putting p2 at the
     * beginning and p1 k nodes into the list.
     * Move the pointers at the same pace.
     * p1 will hit the end of the linked list after Length - k steps.
     * At that point, p2 will be length - k nodes into the list or k nodes from
     * the end.
     */
    public static int getKthToLastOptimal(Node node, int k) {
        Node p1 = node;
        Node p2 = node;

        if (k <= 0) {
            return -1;
        }
        // Move p1 k nodes into the list.
        for (int i = 0; i < k; i++) {
            if (p1 == null) { return -1; }
            p1 = p1.next;
        }

        // Move p1 and p2 at the same pace. When p1 hits the end, p2 will be
        // at the kth element.
        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2.data;
    }


}
