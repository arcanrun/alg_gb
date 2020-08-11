package homeworks.hw07;

import lessons.lesson7.Graph;

import java.util.LinkedList;

public class PathFinder {
    private boolean[] marked;
    private int[] edgeTo;
    private int source;
    private Graph g;

    public PathFinder(Graph g, int source) {
        this.g = g;
        this.source = source;
        marked = new boolean[g.getVertexCount()];
        edgeTo = new int[g.getVertexCount()];

    }

    private void dfs(Graph g, int v) {
        marked[v] = true;
        for (int w : g.getAdjList(v)) {
            if (!marked[w]) {
                edgeTo[w] = v;
                dfs(g, w);
            }
        }
    }

    public boolean hasPathTo(int v, String type)
    {
        if(type.equals("bfs")){
            bfs(this.g, this.source);
        }
        else if(type.equals("dfs")){
            dfs(this.g, this.source);
        }
        else {
            throw new IllegalArgumentException("Unknown algorithm");
        }
        return marked[v];
    }

    public LinkedList<Integer> pathTo(int v, String type) {
        if (!hasPathTo(v, type)) {
            return null;
        }
        LinkedList<Integer> stack = new LinkedList<>();
        int vertex = v;
        while(vertex != source){
            stack.push(vertex);
            vertex = edgeTo[vertex];
        }
        return stack;
    }

    private void bfs(Graph g, int source) {
        LinkedList<Integer> queue = new LinkedList<>();
        queue.addLast(source);
        marked[source] = true;

        while (!queue.isEmpty()) {
            int vertex = queue.removeFirst();
            for (int w : g.getAdjList(vertex)) {
                if (!marked[w]) {
                    marked[w] = true;
                    edgeTo[w] = vertex;
                    queue.addLast(w);
                }
            }
        }
    }
}
