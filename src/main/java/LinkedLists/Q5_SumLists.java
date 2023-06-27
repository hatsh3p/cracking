package LinkedLists;
/**
 * Problem: You have two numbers represented by a linked list where each node
 * contains a single digit. The digits are stored in reverse order such that the
 * 1's digit is at the head of the list. Write a function that adds the two
 * numbers and returns the sum as a linked list.
 * DO NOT CONVERT THE LISTS INTO INTS.
 *
 * Inputs:                       Outputs:
 * (7->1->6) + (5->9->2)         (2->1->9)
 * (617)    + (295)              (912)
 */
public class Q5_SumLists {
    /**
     * Solution 1:
     *
     * Time complexity:     O(N) where N is the length of the longer list.
     * Space complexity:    O(N)
     *
     */
    public static Node sumLists(Node list1, Node list2) {
        int sum = 0;
        int carryOver = 0;
        Node sumHead = null;
        while (list1 != null || list2 != null) {
            if (list1 != null) {
                sum += list1.data;
            }
            if (list2 != null) {
                sum += list2.data;
            }
            sum += carryOver;
            if (sum > 9) {
                sum = sum % 10;
                carryOver = 1;
            } else {
                carryOver = 0;
            }
            if (sumHead == null) {
                sumHead = new Node(sum);
            } else {
                sumHead.appendToTail(sum);
            }
            sum = 0;  // reset sum.
            list1 = list1.next;
            list2 = list2.next;

        }
        return sumHead;
    }

    /**
     * CTCI has a more complicated recursive solution that is not more
     * efficient. Worth reviewing when I get to recursion.
     */
}