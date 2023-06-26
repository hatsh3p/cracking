package LinkedLists;

/**
 * Problem: Write code to partition a linked list around a value such that all
 * nodes less than x come before all nodes greater than or equal to x.
 * Input:                           Output:
 * 3->5->8->5->10->2->1             3->1->2|->10->5->5->8
 */
public class Q4_Partition {
    /**
     * Solution 1: NOT WORKING. ABANDONED FOR NOW. KEEPING AS DOCUMENTATION.
     */
    public static void partition(Node head, int partition) {
        Node smaller = null, head_Smaller = null, greaterOrEqual = null, head_GreaterOrEqual = null;
        Node current = head;
        while (current != null) {
            Node next = current.next;
            current.next = null;
            // Insert node into smaller list.
            if (current.data < partition) {
                if (head_Smaller == null) {
                    head_Smaller = current;
                }
                smaller = current;
                smaller = smaller.next;
            } else { // Insert node into greater than or equal list.
                if (head_GreaterOrEqual == null) {
                    head_GreaterOrEqual = current;
                }
                greaterOrEqual = current;
                greaterOrEqual = greaterOrEqual.next;
            }
            current = next;
        }
        smaller = head_GreaterOrEqual;
        head = head_Smaller;
        System.out.println(head_Smaller.toString());
        System.out.println(head_GreaterOrEqual.toString());
    }

    /**
     * Solution 2: Move smaller elements to the head. Move larger elements
     * to the tail.
     */
    public static Node partition2(Node node, int x) {
        Node head = node;
        Node tail = node;

        while (node != null) {
            Node next = node.next;
            if (node.data < x) {
                // Insert node at head.
                node.next = head;
                head = node;
            } else {
                // Insert node at tail.
                tail.next = node;
                tail = node;
            }
            node = next;
        }
        tail.next = null;
        return head;
    }
}
