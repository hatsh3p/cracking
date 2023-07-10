package TreesAndGraphs;
/**
 * Problem: Implement a function to check if a binary tree is a binary search
 * tree.
 * A binary tree consists of nodes that have two child nodes.
 * A binary search tree consists of nodes where the left child is less than
 * the parent and the right child is greater than the parent.
 */
public class Q5_ValidateBST {
    /**
     * Solution 1:
     * Write a recursive function that checks the children.
     * My solution only checks that the node's children are valid. It doesn't
     * check that the whole tree is valid.
     */
    public static boolean validBST(TreeNode node) {
        if (node == null) {
            return false;
        } return checkChildren(node);
    }
    public static boolean checkChildren(TreeNode node) {
        // Base cases
        if (node.right.key < node.key || node.left.key > node.key) {
            return false;
        }

        if (node.right != null && node.left != null) {
            return checkChildren(node.right) && checkChildren(node.left);
        } else if (node.right == null) {
            return checkChildren(node.left);
        } else if (node.left == null) {
            checkChildren(node.right);
        }
        return true;
    }

    /**
     * Solution 2:
     */
    public static boolean checkBST(TreeNode n) {
        return checkBST(n, null, null);
    }

    private static boolean checkBST(TreeNode n, Integer min, Integer max) {
        if (n == null) {
            return true;
        }
        if ((min != null && n.key <= min) || (max != null && n.key > max) ) {
            return false;
        }
        if (!checkBST(n.left, min, n.key) || !checkBST(n.right, n.key, max)) {
            return false;
        }
        return true;
    }
}
