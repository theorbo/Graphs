
package BellmanFordAlgorithm;

public class EdgeBellman {

    private int cost;
    private VertexBellman source;
    private VertexBellman destination;

    public EdgeBellman(int cost, VertexBellman source, VertexBellman destination) {
        this.cost = cost;
        this.source = source;
        this.destination = destination;
    }

    public int getCost() {

        return cost;
    }

    public void setCost(int cost) {

        this.cost = cost;
    }

    public VertexBellman getSource() {

        return source;
    }

    public void setSource(VertexBellman source) {

        this.source = source;
    }

    public VertexBellman getDestination() {

        return destination;
    }

    public void setDestination(VertexBellman destination) {

        this.destination = destination;
    }

}
