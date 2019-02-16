
package DepthFirstSearch;

import java.util.ArrayList;
import java.util.List;

public class AppCycleDetection {
    
    public static void main(String args[]){
        
        CycleDetection cycleDetection = new CycleDetection();
        
        VertexCycle v1 = new VertexCycle("1");
        VertexCycle v2 = new VertexCycle("2");
        VertexCycle v3 = new VertexCycle("3");
        VertexCycle v4 = new VertexCycle("4");
        VertexCycle v5 = new VertexCycle("5");
        VertexCycle v6 = new VertexCycle("6");
        
        //Scenario 1 : Graph where Cycle is present.
        /*v1.addNeighbourVertex(v2);
        v2.addNeighbourVertex(v3);
        v3.addNeighbourVertex(v4);
        v4.addNeighbourVertex(v1);
        v2.addNeighbourVertex(v6);
        v5.addNeighbourVertex(v4); */
        
        //Scenario 2 : Graph where Cycle is not present.
        v1.addNeighbourVertex(v2);
        v1.addNeighbourVertex(v3);
        
        v2.addNeighbourVertex(v4);
        
        v3.addNeighbourVertex(v4);
        v3.addNeighbourVertex(v5);
        v3.addNeighbourVertex(v6);
        
        List<VertexCycle> vertices = new ArrayList<VertexCycle>();
        
        vertices.add(v1);
        vertices.add(v2);
        vertices.add(v3);
        vertices.add(v4);
        vertices.add(v5);
        vertices.add(v6);
        
        cycleDetection.cycleDetection(vertices);
          
    }

}
