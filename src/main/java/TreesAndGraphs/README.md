# Trees And Graphs

The first run-through of this problem set will mostly involve reading the
questions and trying to understand the solutions. I will go through the 
questions again and come up with my own solutions.

Trees and Graphs are non-linear (i.e. not sequential) data structures.

## Trees
### Motivation
Makes sorted list functions faster.
Recall in lists, get is O(n). We want to get closer to O(log N).

### Tree Basics
A tree is a representation of a hierarchy.

It is a data structure with:
- Single root node (possibly null)
- Parents and children
- Nodes and links (similar to a linked list)
- Each node can have zero or one parent
- Each node may have zero, one, or more children

Useful for / used in:
- Showing categories (music -> popular -> dance -> Erasure)
- Finding data quickly ("indexing")
- Building file systems, databases, etc.

### Definitions

**binary tree** - Each parent has a maximum of two children. All nodes are 
connected to the root of the tree.

**height** - Distance from node to the farthest leaf.

**tree height** - Distance from the root node to the farthest leaf.

**degenerate tree** - Each node has 1 child.

**full tree** - Each interior node has 2 children.

**perfect tree** - Each interior node has 2 children AND all leaves are the same
distance from (depth to) root.

**balanced tree** - Height of left subtree and right subtree differ by at most 1.

**traversal** - A way of hitting every node in a tree, usually in order to do 
something with it.

**in-order traversal** - Produces sorted order.

**pre-order traversal** - Visits parents first.

**post-order traversal** - Visits children first.


### Binary Search Tree (BST)

## Graphs
### Graph Basics
A graph is a list of vertices and connections between vertices (links or edges)
AKA a network.

G = (V, E)

A graph is composed of two things:
1. A set of nodes or vertices (V), usually numbered from 0 to n - 1 and have
some additional data.
2. A set of edges (E). May be directed or undirected. May be weighted or unweighted.


### Attributes and the Four Types of Graphs
In a directed graph, the edges have a single direction.

In an undirected graph, the edges are bidirectional and can be traversed in either
direction.

In a weighted graph, each edge has a cost.

In an unweighted graph, traversing edges has uniform or no cost.

1. Directed, unweighted
2. Directed, weighted (ex. maps)
3. Undirected, unweighted (ex. Facebook)
4. Undirected, weighted

### Definitions
**adjacent** - Two vertices are connected by an edge.

**path** - A sequenc eof edges to travel from one vertex to the next.

**cycle** - A path that begins and ends in the same vertex.

**fully connected graph** - a path exists from any vertex to every other vertex

**stongly connected graph** - same as above and is also directed.

### Representing Graphs in Java
### Adjacency List


### Adjacency Matrix

## Graph Algorithms

### Topological Search
### Depth First Search
### Breadth First Search

