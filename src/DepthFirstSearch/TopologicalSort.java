package DepthFirstSearch;

import java.util.List;
import java.util.Stack;

public class TopologicalSort {
    
    public Stack<Vertex> stack;
    
    TopologicalSort(){
        this.stack = new Stack();
    }

    public void topoSort(List<Vertex> vertices){
        
        for(Vertex v : vertices){
            if(!v.isVisited()){
                topologicalSort(v);
            }
        }
        
    }
    
    public void topologicalSort(Vertex root){
        
        root.setVisited(true);
       
            List<Vertex> adjVertices = root.getNeighbourList();
            
            for(Vertex v : adjVertices){
                if(!v.isVisited()){
                topologicalSort(v);
                }  
            } 
            stack.push(root); 
    }
    
    public Stack<Vertex> getStack(){
        
        return this.stack;
    }
}
