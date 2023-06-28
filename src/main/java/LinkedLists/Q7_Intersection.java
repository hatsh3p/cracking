package LinkedLists;

/**
 * Problem: Given two (singly) linked lists, determine if two lists intersect.
 * Return the intersecting node. Node that the intersection is based on
 * reference, not value. That is if the kth node of the first linked list is
 * the exact same node by reference as the jth node of the second linked list,
 * they are intersecting.
 * Inputs:                          Outputs: true
 * 1 -> 2 -> 3 -> 4
 *      9 -> ^
 */
public class Q7_Intersection {
    /**
     * Solution 1:
     *
     * Time Complexity:     O(A + B) where A and B are the lengths of the lists.
     * Space Complexity:    O(1)
     *
     * CTCI solution is effectively the same but uses OOP and multiple functions.
     * A good exercise would be rewriting this into functions.
     */
    public static Node getIntersection(Node list1, Node list2) {
        // Get the lengths of the two lists.
        int len1 = 0;
        int len2 = 0;

        Node current = list1;
        while(current != null) {
            ++len1;
            current = current.next;
        }
        current = list2;

        while (current != null) {
            ++len2;
            current = current.next;
        }

        // Iterate through the lists until i = |len1 - len2|.
        int lenDiff = Math.abs(len1 - len2);
        Node longerList;
        Node shorterList;
        if (len1 >= len2) {
            longerList = list1;
            shorterList = list2;
        } else {
            longerList = list2;
            shorterList = list1;
        }
        for (int i = 0; i < lenDiff; i++) {
            longerList = longerList.next;
        }

        while (longerList != null) {
            if (longerList.equals(shorterList)) {
                return longerList;
            }
            longerList = longerList.next;
            shorterList = shorterList.next;
        }
        return null;
    }

    /**
     * Solution 2: Same algorithm, broken down into functions.
     */
    public static Node getIntersection2(Node list1, Node list2) {
        Node longerList = incrementLongerList(list1, list2);
        Node shorterList = (longerList == list1) ? list1 : list2;

        while (longerList != null) {
            if (longerList.equals(shorterList)) {
                return longerList;
            }
            longerList = longerList.next;
            shorterList = shorterList.next;
        }

        return null;
    }

    public static Node incrementLongerList(Node list1, Node list2) {
        int sizeDiff = Math.abs(list1.size() - list2.size());
        Node longerList = list1.size() > list2.size() ? list1 : list2;
        for (int i = 0; i < sizeDiff; i++) {
            longerList = longerList.next;
        }
        return longerList;
    }
}
