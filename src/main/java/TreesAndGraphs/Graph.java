package TreesAndGraphs;

/* Simple graph implementation based on @TuringFly from github */
public class Graph {
    public static int MAX_VERTICES = 6;
    private TreeNode vertices[];
    public int count;

    public Graph() {
        vertices = new TreeNode[MAX_VERTICES];
        count = 0;
    }

    public void addNode(TreeNode x) {
        if (count < vertices.length) {
            vertices[count] = x;
            count++;
        } else {
            System.out.println("Graph full.");
        }
    }

    public TreeNode[] getNodes() {
        return vertices;
    }


}
