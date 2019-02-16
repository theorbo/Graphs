
package BellmanFordAlgorithm;

import java.util.*;

public class BellmanFord {

    private List<VertexBellman> vertices;
    private List<EdgeBellman> edges;

    public BellmanFord(List<VertexBellman> vertices, List<EdgeBellman> edges) {
        this.vertices = vertices;
        this.edges = edges;
    }

    public void findShortestPath(VertexBellman source) {

        source.setCost(0);

        for (int i = 0; i < vertices.size() - 1; i++) { // iterate through V-1 tiimes.
            for (EdgeBellman e : edges) {

                VertexBellman u = e.getSource();
                VertexBellman v = e.getDestination();

                if (u.getCost() == Integer.MAX_VALUE) {
                    continue;
                }

                int distance = u.getCost() + e.getCost();

                if (distance < v.getCost()) {
                    v.setCost(distance);
                    v.setPredecessor(u);
                }

            }

            for (EdgeBellman edge : edges) {

                if (edge.getSource().getCost() != Integer.MAX_VALUE) {

                    if (hasCycle(edge)) {
                        System.out.println("This graph has a Cycle");
                    }
                }
            }
        }

    }

    private boolean hasCycle(EdgeBellman edge) {

        return edge.getSource().getCost() + edge.getCost() < edge.getDestination().getCost();
    }
    
    public List<String> getShortestPathTo(VertexBellman targetVartex) {

        List<String> shortestPathToTarget = new ArrayList<String>();

        for (VertexBellman vertex = targetVartex; vertex != null; vertex =
                vertex.getPredecessor()) {
            shortestPathToTarget.add(vertex.getName());
        }

        Collections.reverse(shortestPathToTarget);

        return shortestPathToTarget;

    }

}
