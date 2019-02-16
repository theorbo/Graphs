
package DepthFirstSearch;

import java.util.List;
import java.util.Stack;

/**
 * DFS implementation using stack and recursion.
 *
 */

public class DFS {

    private Stack<Vertex> stack;

    DFS() {
        stack = new Stack<Vertex>();
    }

    public void dfs(List<Vertex> vertexes) {

        for (Vertex v : vertexes) {
            if (!v.isVisited()) {
               // dfsWithStack(v);
                dfsWithRecursion(v);
            }
        }
    }

    public void dfsWithStack(Vertex root) {

        root.setVisited(true);
        stack.push(root);

        while (!stack.isEmpty()) {

            Vertex current = stack.pop();
            System.out.print(current.getVertex() + " ");

            List<Vertex> adjVertex = current.getNeighbourList();

            for (Vertex v : adjVertex) {
                if (v.isVisited() == false) {
                    v.setVisited(true);
                    stack.push(v);
                }

            }
        }
    }
    
    public void dfsWithRecursion(Vertex root){
        
        System.out.print(root.getVertex() + " ");
        root.setVisited(true);
        
        List<Vertex> adjVertex = root.getNeighbourList();
        
        for(Vertex v : adjVertex){
            if(!v.isVisited() == true){
            dfsWithRecursion(v);
            }
        }
    }
}
