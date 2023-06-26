package LinkedLists;

/**
 * Problem: Implement an algorithm to delete a node in the middle (i.e. not
 * first or last and does not need to be exact middle)
 */
public class Q3_DeleteMiddleNode {
    /**
     * Solution:
     *
     * Time Complexity:         O(1)
     * Space Complexity:        O(1)
     *
     */
    public static void deleteMiddleNode(Node node) {
        if (node.next == null) {
            node = null;
        } else {
            node.data = node.next.data;
            node.next = node.next.next;
        }
    }

    /**
     * Solution: Improved.
     */
    public static boolean deleteMiddleNode2(Node node) {
        if (node == null || node.next == null) {
            return false;
        } else {
            node.data = node.next.data;
            node.next = node.next.next;
            return true;
        }
    }
}
