package TreesAndGraphs;

/**
 * Problem: Implement a function to check if a BST is balanced. A balanced BST
 * is one in which the heights of the subtrees of any two nodes never differ by
 * more than one.
 */
public class Q4_CheckBalanced {
    /**
     * Solution 1:
     * Create a function getHeight() that recursively adds one for each level.
     * Create a function that compares the two heights.
     * On the right track, but is double counting the depth... How can we fix
     * this...
     */
    public static boolean isBalanced(TreeNode node) {
        int left = getHeight(node.left);
        int right = getHeight(node.right);
        System.out.println(right);
        System.out.println(left);
        return Math.abs(right - left) <= 1;
    }

    private static int getHeight(TreeNode node) {
        if (node == null) {
            return 0;
        } else if (node.left == null & node.right == null) {
            return 1;
        } else if (node.left == null) {
            return getHeight(node.right);
        } else if (node.right == null) {
            return  getHeight(node.left);
        } else {
            return getHeight(node.left) + getHeight(node.right);
        }
    }

    /**
     * Solution 2: Recurse through the entire tree and for each node,
     * compute the heights of its subtree.
     * Node efficient b/c each node is recursed. O(N log N).
     * Need to cut some of the calls to getHeight.
     *
     */
    int getHeight2(TreeNode node) {
        if (node == null) return -1;
        return Math.max(getHeight2(node.left), getHeight2(node.right)) + 1;
    }

    static boolean isBalanced2(TreeNode node) {
        if (node == null) return true; // Base Case
        int heightDiff = getHeight(node.left) - getHeight(node.right);
        if (Math.abs(heightDiff) > 1) {
            return false;
        } else {
            // Recurse
            return isBalanced(node.left) && isBalanced(node.right);
        }
    }

    /**
     * Solution 3: O(N) time and O(H) space where H is the height of the tree.
     */
    int checkHeight(TreeNode node) {
        if (node == null) return -1;
        int leftHeight = checkHeight(node.left);
        if (leftHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE;

        int rightHeight = checkHeight(node.right);
        if (rightHeight ==Integer.MIN_VALUE) return Integer.MIN_VALUE;

        int heighDiff = leftHeight - rightHeight;
        if(Math.abs(heighDiff) > 1) {
            return Integer.MIN_VALUE; // found error -> pass it back
        } else {
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    boolean isBalanced3(TreeNode node) {
        return checkHeight(node) != Integer.MIN_VALUE;
    }
}
