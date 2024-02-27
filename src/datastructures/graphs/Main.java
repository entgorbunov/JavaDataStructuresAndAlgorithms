package datastructures.graphs;

public class Main {
    public static void main(String[] args) {

        var graph = new Graph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");

        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("A", "D");
        //graph.addEdge("B", "A");
        graph.addEdge("B", "D");
        //graph.addEdge("C", "A");
        graph.addEdge("C", "D");
        //graph.addEdge("D", "A");
        //graph.addEdge("D", "B");
        //graph.addEdge("D", "C");

        //graph.removeEdge("D", "A");
        //graph.removeEdge("D", "B");
        //graph.removeEdge("D", "C");

        graph.removeVertex("D");

        graph.printGraph();
    }
}
