package TreesAndGraphs;

public class BST {
    TreeNode root;

    public BST() {
        root = null;
    }

    public BST(TreeNode root) {
        this.root = root;
    }

    /**
     * find()
     * Given a key, determine whether it exists in the BST.
     * Since we are using recursion, we will have a private find that will
     * be called recursively.
     */
    public boolean find(int key) {
        return find(root, key);
    }

    /**
     * find()
     * Base case 1: key == null.
     * Base case 2: key == node.key.
     * Recursive case 1: key < node.key (recurse left).
     * Recursive case 2: key > node.key (recurse right).
     */
    private boolean find(TreeNode node, int key) {
        if (node == null) {
            return false;
        } else if (key == node.key) {
            return true;
        } else if (key < node.key) {
            return find(node.left, key);
        } else {
            return find(node.right, key);
        }
    }

    /**
     * insert()
     * Given a key, insert it into the BST.
     * BST insert always inserts a leaf node where find would return false.
     */
    public void insert(int key) {
        root = insert(root, key); // Start with the root node.
    }
    private TreeNode insert(TreeNode node, int key) {
        // Base case: Insert at the leaf.
        if (node == null) {
            return new TreeNode(key);
        } else if (key < node.key) {
            // Insert at the left/right depending on the key and node.key
            // Rebuild the tree in case the child is where the node is inserted?
            node.left = insert(node.left, key);
        } else {
            // This will insert duplicates on the right side of the tree.
            node.right = insert(node.right, key);
        }
        return node;
    }

    /**
     * What's the deal with tree traversals?
     * Tree traversals (in-order, pre-order, post-order)
     * (1) in-order produces sorted order. To do this you need to do visit in
     * the following order: left subtree, this, right subtree.
     * (2) pre-order visits the parents first. This is good for copying a tree.
     * (3) post-order visits the children before the parents. Useful for
     * expression evaluation where the leaves are variables / values and the
     * interior nodes are operators.
     */

    /**
     * In-Order Traversal
     */
    public void inOrderTraversal() {
        inOrderTraversal(root);
        System.out.println();
    }

    private void inOrderTraversal(TreeNode node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.printf("%d ", node.key);
            inOrderTraversal(node.right);
        }
    }

    /**
     * Pre-Order Traversal
     */
    public void preOrderTraversal() {
        preOrderTraversal(root);
        System.out.println();
    }

    private void preOrderTraversal(TreeNode node) {
        if (node != null) {
            System.out.printf("%d ", node.key);
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }
    /**
     * Post-Order Traversal
     */
    public void postOrderTraversal() {
        postOrderTraversal(root);
        System.out.println();
    }

    private void postOrderTraversal(TreeNode node) {
        if (node != null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.printf("%d ", node.key);
        }
    }

    /**
     * delete()
     * The most complicated of the BST functions because when a node is removed
     * we need to maintain the order of the nodes.
     */
    public void remove(int key) {
        root = delete(root, key);
    }

    private TreeNode delete(TreeNode node, int key) {
        // Base case: Key not found.
        if (node == null) {
            return null;
        }
        // Key is less than the key of current.
        // Check right and return node.
        if (node.key < key) {
            node.right = delete(node.right, key);
            return node;
        } else if (node.key > key) {
            node.left = delete(node.left, key);
            return node;
        } else { // key == node.data
            // Two possibilities
            // (1) The node has 0-1 children. Promote the child to where the
            // parent is in the BST.
            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            }
            // (2) The node has 2 children. For this we need to find the
            // in-order successor.
            if (node.right.left == null) {
                node.key = node.right.key;
                node.right = node.right.right;
            } else {
                node.key = removeSmallest(node.right);
            }
            return node;
        }
    }

    /**
     * This node is a grandparent to a leaf. Copy the data, remove the node,
     * and return the data.
     */
    private int removeSmallest(TreeNode node) {
        if (node.left.left == null) {
            int smallest = node.left.key;
            node.left = node.left.right;
            return smallest;
        } else {
            return removeSmallest(node.left);
        }
    }

}
