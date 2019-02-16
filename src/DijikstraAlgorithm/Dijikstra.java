
package DijikstraAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Dijikstra {

    public void computePaths(VertexDijikstra sourceVertex) {

        sourceVertex.setDistance(0);

        PriorityQueue<VertexDijikstra> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(sourceVertex);

        while (!priorityQueue.isEmpty()) {

            VertexDijikstra u = priorityQueue.poll();

            for (EdgeDijikstra e : u.getAdjacenciesList()) {

                VertexDijikstra v = e.getDestination();

                if (v.getDistance() > u.getDistance() + e.getVal()) {
                    priorityQueue.remove(v);

                    v.setDistance(u.getDistance() + e.getVal());
                    v.setPredecessor(u);

                    priorityQueue.add(v);

                }

            }
        }
    }

    public List<String> getShortestPathTo(VertexDijikstra targetVartex) {

        List<String> shortestPathToTarget = new ArrayList<String>();

        for (VertexDijikstra vertex = targetVartex; vertex != null; vertex =
                vertex.getPredecessor()) {
            shortestPathToTarget.add(vertex.getName());
        }

        Collections.reverse(shortestPathToTarget);

        return shortestPathToTarget;

    }
}
