package TreesAndGraphs;

import java.util.Objects;

public class TreeNode {
    TreeNode left;
    TreeNode right;
    int key;

    public TreeNode(int value) {
        left = null;
        right = null;
        this.key = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TreeNode treeNode = (TreeNode) o;
        return key == treeNode.key && Objects.equals(left, treeNode.left) && Objects.equals(right, treeNode.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(left, right, key);
    }
}
