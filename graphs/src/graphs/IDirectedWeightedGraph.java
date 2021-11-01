package graphs;

import java.util.Set;

public interface IDirectedWeightedGraph<V>
{
    //adding vertices and edges
    boolean addVertex(V vertex);
    boolean addEdge(WeightedEdge<V> edge);

    //for ease of use
    boolean addVertex(V... vertices);
    boolean addEdge(WeightedEdge<V>... edges);

    //removing parts of the graph
    boolean removeVertex(V vertex);
    boolean removeEdge(V source, V destination);

    //return the "component" elements of the graph
    Set<V> getVertexSet();
    Set<WeightedEdge<V>> getEdgeSet();

    //contains?
    boolean containsVertex(V vertex);
    boolean containsEdge(V source, V destination);

    //size?
    int vertexSize();
    int edgeSize();

    //graph algorithms? ...
}
