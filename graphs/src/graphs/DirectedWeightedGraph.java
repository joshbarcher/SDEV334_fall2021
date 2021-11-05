package graphs;

import java.util.*;

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

    @Override
    public List<V> dfs(V sourceVertex)
    {
        //precondition
        if (!containsVertex(sourceVertex))
        {
            return new ArrayList<>();
        }

        Set<V> visited = new HashSet<>();
        List<V> traversal = new ArrayList<>();

        //recursively search through the graph
        dfs(sourceVertex, visited, traversal);

        return traversal;
    }

    private void dfs(V currentVertex, Set<V> visited, List<V> traversal)
    {
        if (visited.contains(currentVertex))
        {
            return; //exit!
        }

        //otherwise, visit the current vertex as part of the traversal
        traversal.add(currentVertex);
        visited.add(currentVertex);

        //move to adjacent vertices in the graph and continue the traversal
        Node<V> neighborList = adjLists.get(currentVertex);
        while (neighborList != null)
        {
            //visit the neighbor
            dfs(neighborList.data, visited, traversal);

            //move to the next neighbor
            neighborList = neighborList.next;
        }
    }

    @Override
    public List<V> bfs()
    {
        return null;
    }

    @Override
    public String toString()
    {
        return "|V| = " + vertexSize() + ", |E| = " + edgeSize();
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

        @Override
        public String toString()
        {
            return data.toString();
        }
    }
}
