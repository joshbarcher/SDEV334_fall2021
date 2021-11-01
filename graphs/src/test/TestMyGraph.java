package test;

import graphs.DirectedWeightedGraph;
import graphs.WeightedEdge;

public class TestMyGraph
{
    public static void main(String[] args)
    {
        //this actor graph rates how much I would like to see pairs of actors
        //in the same movie, given a stars system (1-5 stars, 5 being the best,
        //1 the worst)
        DirectedWeightedGraph<String> actors = new DirectedWeightedGraph<>();

        actors.addVertices("Dave Bautista", "Scarlett Johanssen", "Sean Connery",
                "Daniel Craig", "Jennifer Lawrence", "Jim Carrey", "Will Smith");

        actors.addEdges(
            new WeightedEdge<>("Dave Bautista", "Scarlett Johanssen", 4.0),
            new WeightedEdge<>("Dave Bautista", "Jim Carrey", 5.0),
            new WeightedEdge<>("Dave Bautista", "Daniel Craig", 2.0),
            new WeightedEdge<>("Jennifer Lawrence", "Jim Carrey", 4.0),
            new WeightedEdge<>("Jennifer Lawrence", "Scarlett Johanssen", 5.0),
            new WeightedEdge<>("Jennifer Lawrence", "Daniel Craig", 1.0),
            new WeightedEdge<>("Jim Carrey", "Will Smith", 5.0),
            new WeightedEdge<>("Daniel Craig", "Sean Connery", 5.0)
        );

        System.out.println(actors);
    }
}













