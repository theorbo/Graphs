package BreadthFirstSearch;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**Time Complexity : O(V+E)
 * Space Complexity : O(V)
*/
public class Bfs {

    public void bfsTraversal(Vertex root){
        
        //LinkedList extends Queue interface. Hence Linked List is used.
        Queue<Vertex> queue = new LinkedList<>();
        
        root.setVisited(true);
        queue.add(root);
        
        while(!queue.isEmpty()){
            
            Vertex current =  queue.poll();
            System.out.print(current.getData() + " ");
            
            List<Vertex> adjacentVertices = current.getNeighbourList();
            
            for(Vertex adj : adjacentVertices){
                
                if(adj.isVisited() ==  false){
                    adj.setVisited(true);
                    queue.add(adj);
                }
            }
           
        }
        
    }
}
