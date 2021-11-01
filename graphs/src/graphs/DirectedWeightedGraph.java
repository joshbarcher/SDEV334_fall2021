package graphs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class DirectedWeightedGraph<V> implements IDirectedWeightedGraph<V>
{
    //adjacency lists
    private Map<V, Node<V>> adjLists = new HashMap<>();

    @Override
    public boolean addVertex(V vertex)
    {
        //preconditions?
        if (containsVertex(vertex))
        {
            return false; //a duplicate vertex!
        }

        //put the vertex in the graph
        adjLists.put(vertex, null);
        return true;
    }

    @Override
    public boolean addEdge(WeightedEdge<V> edge)
    {
        //preconditions?
        if (containsEdge(edge.getSource(), edge.getDestination()))
        {
            return false;
        }

        //otherwise add the edge
        Node<V> list = adjLists.get(edge.getSource());
        if (list == null)
        {
            //first incident edge
            adjLists.put(edge.getSource(), new Node<>(edge.getDestination(), null));
        }

        return false;
    }

    // this method will try to add all the input vertices
    // this method will return true if all vertices are added successfully
    @Override
    public boolean addVertex(V... vertices)
    {
        boolean allSuccessful = true;
        for (V vertex : vertices)
        {
            allSuccessful = allSuccessful && addVertex(vertex);
        }
        return allSuccessful;
    }

    @Override
    public boolean addEdge(WeightedEdge<V>... edges)
    {
        return false;
    }

    @Override
    public boolean removeVertex(V vertex)
    {
        return false;
    }

    @Override
    public boolean removeEdge(V source, V destination)
    {
        return false;
    }

    @Override
    public Set<V> getVertexSet()
    {
        return null;
    }

    @Override
    public Set<WeightedEdge<V>> getEdgeSet()
    {
        return null;
    }

    @Override
    public boolean containsVertex(V vertex)
    {
        return adjLists.containsKey(vertex);
    }

    @Override
    public boolean containsEdge(V source, V destination)
    {
        return false;
    }

    @Override
    public int vertexSize()
    {
        return 0;
    }

    @Override
    public int edgeSize()
    {
        return 0;
    }

    private static class Node<V>
    {
        private V data;
        private Node<V> next;

        public Node(V data, Node<V> next)
        {
            this.data = data;
            this.next = next;
        }
    }
}
