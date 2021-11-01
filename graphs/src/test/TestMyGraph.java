package test;

import graphs.DirectedWeightedGraph;

public class TestMyGraph
{
    public static void main(String[] args)
    {
        DirectedWeightedGraph<String> actors = new DirectedWeightedGraph<>();

        actors.addVertex("Dave Bautista", "Scarlett Johanssen", "Sean Connery",
                "Daniel Craig", "Jennifer Lawrence", "Jim Carrey", "Will Smith");

        System.out.println(actors);
    }
}
