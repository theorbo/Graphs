package DepthFirstSearch;

import java.util.List;

public class CycleDetection {
    
    public void cycleDetection(List<VertexCycle> vertices){
        
        for(VertexCycle v : vertices){  
            if(!v.isVisited()){
            cycleDetect(v);
            }
        }
    }
    
    public void cycleDetect(VertexCycle root){
        
        
        System.out.println();
        System.out.println(root.getName() + " is being visited....");
        
        root.setBeingVisited(true);
        
        for(VertexCycle v : root.getNeighbourList()){
            
            if(v.isBeingVisited()){
                System.out.println("Cycle Detected");
                break;
            }
            
            else if(!v.isVisited()){
                System.out.println(v.getName() + " is visited");
                v.setVisited(true);
                cycleDetect(v);
            }
        }
        
        root.setBeingVisited(false);
       // root.setVisited(true);
    }

}
