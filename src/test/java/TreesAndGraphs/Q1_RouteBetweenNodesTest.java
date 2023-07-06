package TreesAndGraphs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q1_RouteBetweenNodesTest {
    Q1_RouteBetweenNodes.GraphNode a;
    Q1_RouteBetweenNodes.GraphNode b;
    Q1_RouteBetweenNodes.GraphNode c;
    Q1_RouteBetweenNodes.GraphNode d;
    Q1_RouteBetweenNodes.GraphNode e;
    Q1_RouteBetweenNodes.GraphNode f;

    @BeforeEach
    void setUp() {
        // a: [b, c]
        // b: [d]
        // c: [e]
        // d: []
        // e: [f]
        // a->b->d->null
        // a->c->e->f->null
        a = new Q1_RouteBetweenNodes.GraphNode();
        b = new Q1_RouteBetweenNodes.GraphNode();
        c = new Q1_RouteBetweenNodes.GraphNode();
        d = new Q1_RouteBetweenNodes.GraphNode();
        e = new Q1_RouteBetweenNodes.GraphNode();
        f = new Q1_RouteBetweenNodes.GraphNode();
        a.nodes.add(b);
        a.nodes.add(c);
        b.nodes.add(d);
        c.nodes.add(e);
        e.nodes.add(f);
    }
    @Test
    void isRouteBFS_BC_False() {
        Assertions.assertFalse(Q1_RouteBetweenNodes.isRouteBFS(b, c));
    }

    @Test
    void isRouteBFS_AD_True() {
        Assertions.assertTrue(Q1_RouteBetweenNodes.isRouteBFS(a, d));
    }

    @Test
    void isRouteDFS_BC_False() {
        Assertions.assertFalse(Q1_RouteBetweenNodes.isRouteBFS(b, c));
    }

    @Test
    void isRouteDFS_AD_True() {
        Assertions.assertTrue(Q1_RouteBetweenNodes.isRouteBFS(a, d));
    }

    @Test
    void recursiveIsRoute_BC_False() {
        Assertions.assertFalse(Q1_RouteBetweenNodes.recursiveIsRoute(b, c));
    }

    @Test
    void recursiveIsRoute_AD_True() {
        Assertions.assertTrue(Q1_RouteBetweenNodes.recursiveIsRoute(a, d));
    }
}