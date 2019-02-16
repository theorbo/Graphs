package BreadthFirstSearch;

public class App {
    
    public static void main(String args[]){
        
        Bfs bfs = new Bfs();
        
        Vertex v1 = new Vertex(1);
        Vertex v2 = new Vertex(2);
        Vertex v3 = new Vertex(3);
        Vertex v4 = new Vertex(4);
        Vertex v5 = new Vertex(5);
        Vertex v6 = new Vertex(6);
        
        v1.addNeighbourList(v2);
        v1.addNeighbourList(v3);
        
        v2.addNeighbourList(v4);
        
        v3.addNeighbourList(v4);
        v3.addNeighbourList(v5);
        v3.addNeighbourList(v6);
        
        /**
         * Output : 1 2 3 4 5 6 
         */
        bfs.bfsTraversal(v1);
        
    }

}
