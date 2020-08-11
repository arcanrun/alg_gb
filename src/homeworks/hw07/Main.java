package homeworks.hw07;

import lessons.lesson7.BreadthFirstPath;
import lessons.lesson7.Graph;


public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(10);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(0,3);
        graph.addEdge(1,4);
        graph.addEdge(1,9);
        graph.addEdge(2,5);
        graph.addEdge(3,6);
        graph.addEdge(4,7);
        graph.addEdge(5,7);
        graph.addEdge(6,7);
        graph.addEdge(6,8);
        graph.addEdge(7,9);
        graph.addEdge(8,9);

        BreadthFirstPath bfp = new BreadthFirstPath(graph, 0);
        System.out.println(bfp.hasPathTo(9));
        bfp.pathToWithLength(9);

        PathFinder pf = new PathFinder(graph,0);
        System.out.println(pf.hasPathTo(9,"bfs"));
        System.out.println(pf.pathTo(9, "bfs"));
    }
}
