package TreesAndGraphs;
/* Simple graph implementation based on @TuringFly from github */
public class Node {
    private Node adjacent[];
    public int adjacentCount;
    private String vertex;
    public Q1_RouteBetweenNodes.State state;

    public Node(String vertex, int adjacentLength) {
        this.vertex = vertex;
        adjacentCount = 0;
        adjacent = new Node[adjacentLength];
    }

    public void addAdjacent(Node x) {
        if (adjacentCount < adjacent.length) {
            this.adjacent[adjacentCount] = x;
            adjacentCount++;
        } else {
            System.out.println("No more adjacent nodes can be added.");
        }
    }

    public Node[] getAdjacent() {
        return adjacent;
    }

    public String getVertex() {
        return vertex;
    }
}
