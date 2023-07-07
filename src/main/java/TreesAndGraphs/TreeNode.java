package TreesAndGraphs;


/* Simple graph implementation based on @TuringFly from github */
public class TreeNode
{
    private TreeNode adjacent[];
    public int adjacentCount;
    private String vertex;
    public Q1_RouteBetweenNodes.State state;

    public TreeNode(String vertex, int adjacentLength) {
        this.vertex = vertex;
        adjacentCount = 0;
        adjacent = new TreeNode[adjacentLength];
    }

    public void addAdjacent(TreeNode x) {
        if (adjacentCount < adjacent.length) {
            this.adjacent[adjacentCount] = x;
            adjacentCount++;
        } else {
            System.out.println("No more adjacent nodes can be added.");
        }
    }

    public TreeNode[] getAdjacent() {
        return adjacent;
    }

    public String getVertex() {
        return vertex;
    }
}
