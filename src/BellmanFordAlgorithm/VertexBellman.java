
package BellmanFordAlgorithm;

import java.util.*;

public class VertexBellman {

    private String name;
    private boolean visited;
    private List<EdgeBellman> neighbourlist;
    private int val = Integer.MAX_VALUE;
    private VertexBellman predecessor;

    public VertexBellman(String name) {
        this.name = name;
        neighbourlist = new ArrayList<>();
    }

    public void addEdge(EdgeBellman e) {

        this.neighbourlist.add(e);
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public boolean isVisited() {

        return visited;
    }

    public void setVisited(boolean visited) {

        this.visited = visited;
    }

    public List<EdgeBellman> getNeighbourlist() {

        return neighbourlist;
    }

    public void setNeighbourlist(List<EdgeBellman> neighbourlist) {

        this.neighbourlist = neighbourlist;
    }

    public int getCost() {

        return val;
    }

    public void setCost(int cost) {

        this.val = cost;
    }

    public VertexBellman getPredecessor() {

        return predecessor;
    }

    public void setPredecessor(VertexBellman predecessor) {

        this.predecessor = predecessor;
    }

}
