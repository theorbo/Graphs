
package BellmanFordAlgorithm;

import java.util.*;

public class AppBellman {
    
    public static void main(String args[]){
        
        VertexBellman v1 = new VertexBellman("A");
        VertexBellman v2 = new VertexBellman("B");
        VertexBellman v3 = new VertexBellman("C");
        VertexBellman v4 = new VertexBellman("D");
        
        EdgeBellman e1 = new EdgeBellman(1, v1, v2);
        EdgeBellman e2 = new EdgeBellman(2, v1, v4);    
        EdgeBellman e3 = new EdgeBellman(3, v1, v3);
        EdgeBellman e4 = new EdgeBellman(1, v2, v3);
        EdgeBellman e5 = new EdgeBellman(-2, v3, v4);

        v1.addEdge(e1);
        v1.addEdge(e2);
        v1.addEdge(e3);

        v2.addEdge(e4);
        v3.addEdge(e5);

        List<VertexBellman> vertices = new ArrayList<>();
        List<EdgeBellman> edges = new ArrayList<>();
        
        vertices.add(v1);
        vertices.add(v2);
        vertices.add(v3);
        vertices.add(v4);
        
        edges.add(e1);
        edges.add(e2);
        edges.add(e3);
        edges.add(e4);
        edges.add(e5);
        
        
        BellmanFord bellmanFord = new BellmanFord(vertices, edges);
        
        bellmanFord.findShortestPath(v1);
        
        /**
         * Output:
         * [A, B]
           [A, B, C]
           [A, B, C, D]
         */
        
        System.out.println(bellmanFord.getShortestPathTo(v2));
        System.out.println(bellmanFord.getShortestPathTo(v3));
        System.out.println(bellmanFord.getShortestPathTo(v4));
        
        
    }

}
