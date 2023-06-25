package LinkedLists;

/**
 * Problem: Write code to remove duplicates from an unsorted linked list.
 * Follow up: How would you solve this if a temporary buffer is not allowed.
 *      Input:                  Output:
 *      1->2->1->3->2           1->2->3
 */
public class Q1_RemoveDups {
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

}
