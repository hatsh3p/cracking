package TreesAndGraphs;

/**
 * Problem: Write an algorithm to find the "next" node (i.e. in-order successor)
 * of a given node in a binary search tree. You may assume that each node has
 * a link to its parent.
 */
public class Q6_Successor {
    /**
     * Solution 1:
     * To ensure that a binary search tree "promotes" the right node after
     * deletion we need to find the in-order successor.
     *
     * Let's think through the possible cases.
     * (1) If we delete a node where node.left == null and node.right == null,
     * then the successor = null.
     * (2) If we delete a node where node.right == null, then we set the
     * successor = node.left.
     * (3) If we delete a node where node.left == null, then we set the
     * successor = node.right.
     * (4) If the node has nodes on the left AND the right, then the successor
     * should be node.right.left (this keeps the order).
     * If node.right.left == null then we need to promote the smallest node
     * on the right.
     *
     * If the node has a right subtree then the successor is the leftmost node
     * in that subtree.
     */
    public static TreeNode inOrderSuccessor(TreeNode node) {
        if (node.right == null && node.left == null) {
            return null;
        } else if (node.left == null) {
            return node.right;
        } else if (node.right == null) {
            return node.left;
        } else if (node.right.left != null) {
            return node.right.left;
        } else {
            return findSmallest(node.right);
        }
    }

    private static TreeNode findSmallest(TreeNode node) {
        if (node.left == null && node.right == null) {
            return node;
        } else if (node.left.left == null) {
            return node.left;
        } else {
            return findSmallest(node.left);
        }
    }
}
