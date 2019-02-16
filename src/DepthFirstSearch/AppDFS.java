
package DepthFirstSearch;

import java.util.ArrayList;
import java.util.List;


public class AppDFS {
    
    public static void main(String args[]){
        
        DFS dfs = new DFS();
        
        
        Vertex v1 = new Vertex("1");
        Vertex v2 = new Vertex("2");
        Vertex v3 = new Vertex("3");
        Vertex v4 = new Vertex("4");
        Vertex v5 = new Vertex("5");
        Vertex v6 = new Vertex("6");
        
        v1.addNeighbourList(v2);
        v1.addNeighbourList(v3);
        
        v2.addNeighbourList(v4);
        
        v3.addNeighbourList(v4);
        v3.addNeighbourList(v5);
        v3.addNeighbourList(v6);
        
        List<Vertex> v = new ArrayList<Vertex>();
        
        v.add(v1);
        v.add(v2);
        v.add(v3);
        v.add(v4);
        v.add(v5);
        v.add(v6);
        
        /**
         * One of the possible outputs : 1 2 4 3 5 6 
         * Right side dfs as well as left side dfs possible.
         */
        
        dfs.dfs(v);
        
    }

}
