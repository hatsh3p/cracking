package TreesAndGraphs;

/**
 * Problem: Given a sorted (increasing order) array with unique integer elements,
 * write an algorithm to create a binary search tree with minimal height.
 */
public class Q2_MinimalTree {
    /**
     * Solution 1: CTCI
     * We want to the root of the tree to be the middle element of the array
     * so that the left and right subtrees are have about the same depth.
     *
     * To do this we create a function createMinimalBST that takes a start and
     * end index as well as the array.
     *
     * Each call to the function creates a node
     * with the data from the middle position in the array. Then there are
     * recursive calls to do the same on the left and right.
     */
    public static TreeNode createMinimalBST(int[] arr) {
        return createMinimalBST(arr, 0, arr.length - 1);
    }

    private static TreeNode createMinimalBST(int[] arr, int start, int end) {
        if (end < start) {
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(arr[mid]);
        node.left = createMinimalBST(arr, start, mid - 1);
        node.right = createMinimalBST(arr, mid + 1, end);
        return node;
    }
}
