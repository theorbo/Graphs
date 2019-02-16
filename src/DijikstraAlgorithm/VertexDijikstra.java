
package DijikstraAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class VertexDijikstra implements Comparable<VertexDijikstra>{

    private String name;
    private List<EdgeDijikstra> adjacenciesList;
    // boolean visited is not used.
    private boolean visited;
    private VertexDijikstra predecessor;
    private int distance = Integer.MAX_VALUE;

    public VertexDijikstra(String name) {
        this.name = name;
        this.adjacenciesList = new ArrayList<EdgeDijikstra>();
    }

    public void addEdge(EdgeDijikstra e) {

        this.adjacenciesList.add(e);
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public List<EdgeDijikstra> getAdjacenciesList() {

        return adjacenciesList;
    }

    public void setAdjacenciesList(List<EdgeDijikstra> adjacenciesList) {

        this.adjacenciesList = adjacenciesList;
    }

    public boolean isVisited() {

        return visited;
    }

    public void setVisited(boolean visited) {

        this.visited = visited;
    }

    public VertexDijikstra getPredecessor() {

        return predecessor;
    }

    public void setPredecessor(VertexDijikstra predecessor) {

        this.predecessor = predecessor;
    }

    public int getDistance() {

        return distance;
    }

    public void setDistance(int distance) {

        this.distance = distance;
    }

    @Override
    public int compareTo(VertexDijikstra o) {
        return Integer.compare(this.distance, o.distance);
        
    }

}
