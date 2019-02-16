
package DepthFirstSearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AppTopologicalSort {
    
    public static void main(String args[]){
   
    TopologicalSort topoLogicalSort = new TopologicalSort();
    
    Vertex v1 = new Vertex("1");
    Vertex v2 = new Vertex("2");
    Vertex v3 = new Vertex("3");
    Vertex v4 = new Vertex("4");
    Vertex v5 = new Vertex("5");
    Vertex v6 = new Vertex("6");
    
    v5.addNeighbourList(v2);
    v5.addNeighbourList(v6);
    
    v4.addNeighbourList(v6);
    v4.addNeighbourList(v1);
    
    v2.addNeighbourList(v3);
    
    v3.addNeighbourList(v1);
    
    List<Vertex> v = new ArrayList<Vertex>();
    
    v.add(v1);
    v.add(v3);
    v.add(v2);
    v.add(v4);
    v.add(v5);
    v.add(v6);
    
    
    topoLogicalSort.topoSort(v);
    Stack<Vertex> result = topoLogicalSort.getStack();
    
    /**
     * Output 5 :5 4 6 2 3 1 (one of the answers). Can also be 5 4 2 3 1 6
     */
    for(int i= 0; i < v.size(); i++){
        System.out.print(result.pop().getVertex() + " ");
    }
    
    }
    
}
