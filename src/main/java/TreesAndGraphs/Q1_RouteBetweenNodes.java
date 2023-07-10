package TreesAndGraphs;

import java.util.*;

/**
 * Problem: Given a directed graph and two nodes (S and E), design an algorithm to
 * find out whether there is a route from S to E.
 *
 * Hint: This problem can be solved using graph traversal, either (1) Breadth
 * First Search or (2) Depth First Search.
 */
public class Q1_RouteBetweenNodes {
    /**
     * Solution 1: Combination of CTCI and @TuringFly.
     */
    enum State { Unvisited, Visited, Visiting; }

    public static boolean search(Graph g, Q1TreeNode start, Q1TreeNode end) {
        if (start == end) return true;
        LinkedList<Q1TreeNode> q = new LinkedList<>();
        for (Q1TreeNode u: g.getNodes()) {
            u.state = State.Unvisited;
        }
        start.state = State.Visiting;
        q.add(start);
        Q1TreeNode u;
        while (!q.isEmpty()) {
            u = q.removeFirst();
            if (u != null) {
                for (Q1TreeNode v : u.getAdjacent()) {
                    if (v.state == State.Unvisited) {
                        if (v == end) {
                            return true;
                        } else {
                            v.state = State.Visiting;
                            q.add(v);
                        }
                    }
                }
            }
            u.state = State.Visited;
        }
        return false;
    }


    public static Graph createNewGraph() {
        Graph g = new Graph();
        Q1TreeNode[] temp = new Q1TreeNode[6];
        temp[0] = new Q1TreeNode("a", 3);
        temp[1] = new Q1TreeNode("b", 0);
        temp[2] = new Q1TreeNode("c", 0);
        temp[3] = new Q1TreeNode("d", 1);
        temp[4] = new Q1TreeNode("e", 1);
        temp[5] = new Q1TreeNode("f", 0);
        temp[0].addAdjacent(temp[1]);
        temp[0].addAdjacent(temp[2]);
        temp[0].addAdjacent(temp[3]);
        temp[3].addAdjacent(temp[4]);
        temp[4].addAdjacent(temp[5]);
        for (int i = 0; i < 6; i++) {
            g.addNode(temp[i]);
        }
        return g;
    }


    public static void main(String a[]) {
        Graph g = createNewGraph();
        Q1TreeNode[] n = g.getNodes();
        Q1TreeNode start = n[3];
        Q1TreeNode end = n[5];
        System.out.println(search(g, start, end));
    }

    /**
     * Solution 2: Help from @decaf.
     * This can be solved iteratively or recursively.
     * Can use a set to manage the state or build it into the node class.
     *
     * Two algorithms:
     * (1) breadth first search - Check the first node connected to a node
     * (2) depth first search - Check all of the nodes down one node.
     * before going down that node.
     *
     * You can use data structures to accomplish DFS v. BFS.
     * (1) queue - If you add the nodes to a queue, then the nodes will be added
     * and removed in breadth first order.
     * (2) stack - If you add the nodes to a stack, then the nodes will be added
     * and removed in depth first order.
     */
    public static class GraphNode {
        List<GraphNode> nodes;

        public GraphNode() {
            nodes = new ArrayList<>();
        }
    }

    public static boolean isRouteBFS(GraphNode s, GraphNode d) {
        if (s == d) {
            return true;
        }
        Set<GraphNode> visitedNodes = new HashSet<>();
        LinkedList<GraphNode> toVisit = new LinkedList<>(); // Treat as queue.

        toVisit.addAll(s.nodes);
        visitedNodes.add(s);

        while (!toVisit.isEmpty()) {
            GraphNode node = toVisit.getFirst(); // Queue.
            if (node == d) {
                return true;
            }
            visitedNodes.add(node);
            for (GraphNode n: node.nodes) {
                if (!toVisit.contains(n)) {
                    toVisit.addFirst(n);
                }
            }
        }
        return false;
    }

    public static boolean isRouteDFS(GraphNode s, GraphNode d) {
        if (s == d) {
            return true;
        }
        Set<GraphNode> visitedNodes = new HashSet<>();
        LinkedList<GraphNode> toVisit = new LinkedList<>(); // Treat as stack.

        toVisit.addAll(s.nodes);
        visitedNodes.add(s);

        while (!toVisit.isEmpty()) {
            GraphNode node = toVisit.getLast(); // Stack
            if (node == d) {
                return true;
            }
            visitedNodes.add(node);
            for (GraphNode n: node.nodes) {
                if (!toVisit.contains(n)) {
                    toVisit.addFirst(n);
                }
            }
        }
        return false;
    }

    public static boolean recursiveIsRoute(GraphNode s, GraphNode d) {
        if (s == d) {
            return true;
        }
        Set<GraphNode> visited = new HashSet<>();
        visited.add(s);
        return recursiveIsRoute(s, d, visited);
    }

    private static boolean recursiveIsRoute(GraphNode s, GraphNode d, Set<GraphNode> visited) {
        for (GraphNode n: s.nodes) {
            if (n == d) {
                return true;
            }
            if (!visited.contains(n)) {
                visited.add(n);
                return recursiveIsRoute(n, d, visited);
            }
        }
        return false;
    }
}
