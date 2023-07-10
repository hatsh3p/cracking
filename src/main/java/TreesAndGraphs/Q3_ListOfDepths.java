package TreesAndGraphs;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Problem: Given a binary tree, design an algorithm which creates a linked list
 * of all the nodes at each depth (e.g. if you have a tree with depth, D, you'll
 * have D linked lists.
 */
public class Q3_ListOfDepths {
    /**
     * Solution 1: CTCI
     * Modify in order traversal algorithm...
     */
    public static ArrayList<LinkedList<TreeNode>> createLevelLinkedList(TreeNode root) {
        // Create an ArrayList of LinkedLists to store each level.
        ArrayList<LinkedList<TreeNode>> lists = new ArrayList<>();
        // Create the LinkedList for the root level and recursively call those for subsequent levels.
        createLevelLinkedList(root, lists, 0);
        return lists;
    }

    public static void createLevelLinkedList(TreeNode node, ArrayList<LinkedList<TreeNode>> lists, int level) {
        if (node == null) return; // Base case

        // Create a LinkedList for a level and add it the ArrayList OR get
        // the existing list for that level.
        LinkedList<TreeNode> list = null;
        if (lists.size() == level) { // The level is not contained in list.
            list = new LinkedList<TreeNode>();
            /*
            Levels are traversed in order. So if this is the first time, we've
            listed level i , we must have seen levels 0 through i - 1. We can
            therefore safely add the level at the end.
             */
            lists.add(list);
        } else {
            list = lists.get(level);
        }
        // Add the current node to that list.
        list.add(node);

        // Go to the next nodes down and add those nodes to the appropriate list.
        createLevelLinkedList(node.left, lists, level + 1);
        createLevelLinkedList(node.right, lists, level + 1);
    }

}
