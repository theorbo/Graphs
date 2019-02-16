
package DepthFirstSearch;

import java.util.ArrayList;
import java.util.List;

/**
 * The difference lies an extra boolean field named isBeingVisited is used.
 *
 */

public class VertexCycle {

    private String name;
    private boolean isBeingVisited;
    private boolean isVisited;
    List<VertexCycle> neighbourList;

    public VertexCycle(String name) {
        this.name = name;
        neighbourList = new ArrayList<VertexCycle>();
        isBeingVisited = false;
        isVisited = false;
    }

    public void addNeighbourVertex(VertexCycle v) {

        this.neighbourList.add(v);
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public boolean isBeingVisited() {

        return isBeingVisited;
    }

    public void setBeingVisited(boolean isBeingVisited) {

        this.isBeingVisited = isBeingVisited;
    }

    public boolean isVisited() {

        return isVisited;
    }

    public void setVisited(boolean isVisited) {

        this.isVisited = isVisited;
    }

    public List<VertexCycle> getNeighbourList() {

        return neighbourList;
    }

    public void setNeighbourList(List<VertexCycle> neighbourList) {

        this.neighbourList = neighbourList;
    }

    @Override
    public String toString() {

        return name;
    }

}
