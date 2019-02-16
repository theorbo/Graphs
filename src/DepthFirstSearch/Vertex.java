
package DepthFirstSearch;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private String vertex;
    private boolean visited;
    private List<Vertex> neighbourList;

    public Vertex(String vertex) {

        this.vertex = vertex;
        visited = false;
        this.neighbourList = new ArrayList<Vertex>();
    }

    public String getVertex() {

        return vertex;
    }

    public void setVertex(String vertex) {

        this.vertex = vertex;
    }

    public boolean isVisited() {

        return visited;
    }

    public void setVisited(boolean visited) {

        this.visited = visited;
    }

    public List<Vertex> getNeighbourList() {

        return neighbourList;
    }

    public void setNeighbourList(List<Vertex> neighbourList) {

        this.neighbourList = neighbourList;
    }

    public void addNeighbourList(Vertex v) {

        this.neighbourList.add(v);
    }

    @Override
    public String toString() {

        return "Vertex [vertex=" + vertex + "]";
    }

}
