package LinkedLists;

import java.util.HashSet;
import java.util.Set;

/**
 * Problem: Given a linked list which might contain a loop, implement an
 * algorithm that returns the node at the beginning of the loop (if one exists).
 * Input:                       Output:
 * A -> B -> C -> D -> E        C
 *           ^----------
 */
public class Q8_LoopDetection {
    /**
     * Solution 1: With an additional data structure, you can check if a node
     * has been visited before.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     */
    public static Node detectLoop(Node node) {
        Set<Node> visited = new HashSet<>();
        while (node != null) {
            if (visited.contains(node)) {
                return node;
            }
            visited.add(node);
            node = node.next;
        }
        return null;
    }

    /**
     * Solution 2: There must be a way to use a fast and slow pointer to solve
     * this...
     * Time Complexity: O(N)?
     * Space Complexity: O(1)?
     */
    public static boolean detectCycle(Node node) {
        Node slow = node;
        Node fast = node.next;
        if (node.next != null) {
            fast = node.next.next;
        }
        boolean loopDetected = false;
        while (slow != null && fast != null) {
            if (slow.equals(fast)) {
                return true;
            }
            slow = slow.next;
            if (fast.next != null) {
                fast = fast.next.next;
            }
        }
        return false;
    }

    /**
     * Solution 3: CTCI Solution.
     * CTCI breaks this down into the following parts:
     * (1) Detect if the Linked List has a loop. I did this below.
     * (2) When do the pointers collide?
     * (3) Find the start of the loop.
     * (4) Put it all together.
     */
    public static Node getCycleStart(Node node) {
        Node slow = node;
        Node fast = node;

        // Find meeting point. This will be LOOP_SIZE - k steps into the LL.
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) { // Collision.
                break;
            }
        }

        // Error check. No meeting point and therefore no loop.
        if (fast == null || fast.next == null) {
            return null;
        }

        // Move slow to Head. Keep fast at Meeting Point. Each are k steps from
        // the Loop Start. If they move at the same pace, they must meet at
        // Loop Start.
        slow = node;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        // Now both point to the start of the loop.
        return fast;
    }
}
