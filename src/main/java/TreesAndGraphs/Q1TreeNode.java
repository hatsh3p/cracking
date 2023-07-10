package TreesAndGraphs;


/* Simple graph implementation based on @TuringFly from github */
public class Q1TreeNode
{
    private Q1TreeNode adjacent[];
    public int adjacentCount;
    private String vertex;
    public Q1_RouteBetweenNodes.State state;

    public Q1TreeNode(String vertex, int adjacentLength) {
        this.vertex = vertex;
        adjacentCount = 0;
        adjacent = new Q1TreeNode[adjacentLength];
    }

    public void addAdjacent(Q1TreeNode x) {
        if (adjacentCount < adjacent.length) {
            this.adjacent[adjacentCount] = x;
            adjacentCount++;
        } else {
            System.out.println("No more adjacent nodes can be added.");
        }
    }

    public Q1TreeNode[] getAdjacent() {
        return adjacent;
    }

    public String getVertex() {
        return vertex;
    }
}
