
package DijikstraAlgorithm;


public class EdgeDijikstra {

    private int val;
    private VertexDijikstra source;
    private VertexDijikstra destination;
    
    public EdgeDijikstra(int val, VertexDijikstra source, VertexDijikstra destination) {
        this.val = val;
        this.source = source;
        this.destination = destination;
    }

    public int getVal() {
    
        return val;
    }

    
    public void setVal(int val) {
    
        this.val = val;
    }

    
    public VertexDijikstra getSource() {
    
        return source;
    }

    
    public void setSource(VertexDijikstra source) {
    
        this.source = source;
    }

    
    public VertexDijikstra getDestination() {
    
        return destination;
    }

    
    public void setDestination(VertexDijikstra destination) {
    
        this.destination = destination;
    }  
    
}
