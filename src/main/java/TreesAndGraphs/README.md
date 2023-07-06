# Trees And Graphs

The first run-through of this problem set will mostly involve reading the
questions and trying to understand the solutions. I will go through the 
questions again and come up with my own solutions.

# Notes

Trees and Graphs are non-linear (i.e. not sequential) data structures.

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

## Trees
