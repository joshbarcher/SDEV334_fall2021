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
        if (!containsVertex(edge.getSource()) ||
            !containsVertex(edge.getDestination()))
        {
            return false;
        }
        else if (containsEdge(edge.getSource(), edge.getDestination()))
        {
            return false;
        }

        //otherwise add the edge
        Node<V> list = adjLists.get(edge.getSource());
        if (list == null)
        {
            //first incident edge
            adjLists.put(edge.getSource(), new Node<>(edge.getDestination(),
                    null, edge.getWeight()));
        }
        else
        {
            //add a new node at the front of the list
            Node<V> head = new Node<>(edge.getDestination(),
                    list, edge.getWeight());
            adjLists.put(edge.getSource(), head);
        }

        return true;
    }

    // this method will try to add all the input vertices
    // this method will return true if all vertices are added successfully
    public boolean addVertices(V... vertices)
    {
        boolean allSuccessful = true;
        for (V vertex : vertices)
        {
            allSuccessful = allSuccessful && addVertex(vertex);
        }
        return allSuccessful;
    }

    public boolean addEdges(WeightedEdge<V>... edges)
    {
        boolean allSuccessful = true;
        for (WeightedEdge<V> edge : edges)
        {
            allSuccessful = allSuccessful && addEdge(edge);
        }
        return allSuccessful;
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
        private double weight;

        public Node(V data, Node<V> next, double weight)
        {
            this.data = data;
            this.next = next;
            this.weight = weight;
        }
    }
}
