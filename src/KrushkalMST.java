import java.util.*;
import java.lang.*;

class KrushkalMST{

	class Edge  implements Comparable<Edge>{
		int src, des, weight;

		public int compareTo(Edge compareEdge){
			return this.weight - compareEdge.weight;
		}
	}

	int V, E;
	Edge edge[];

	//Initialize the MST with the vertices and edges
	KrushkalMST(int v, int e){
		this.V = v;
		this.E = e;
		edge = new Edge[e];
		for(int i = 0; i < e; i++)
			edge[i] = new Edge();
	}
	
	//Disjoint Set Node
	class Node{
	  int val;
	  int rank;
	  Node parent;

	  Node(int val){
	   this.val = val;
	   this.rank = 0;
	   this.parent = this;
	  }
	}

	Map<Integer, Node> nodeMap = new HashMap<>();

	//MakeSet
	public void makeSet(int v){

		Node node = new Node(v);
		nodeMap.put(v,node);
	}

	//Finds Parent and does Path Compression
	public Node findSet(int val){

		if(!nodeMap.containsKey(val))
			return null;

		Node node = nodeMap.get(val);
		Node parentNode = findParent(node);
		node.parent = parentNode; // Path Compression
		return parentNode;
	}

	public Node findParent(Node node){

		while(node.parent != node){
			node = node.parent;
		}
		return node;
	}

	//Union
	public void union(int a, int b){
		if(!nodeMap.containsKey(a) || !nodeMap.containsKey(b))
			return ;

		Node parentA = findSet(a);
		Node parentB = findSet(b);

		if(parentA.rank > parentB.rank)
			parentB.parent = parentA;

		else if(parentA.rank == parentB.rank){
			parentB.parent = parentA;
			parentA.rank += 1;
		} else {
			parentA.parent = parentB;
		}
	}

	public boolean isCycleFormed(int a, int b){
        if(findSet(a) == findSet(b)){
            return true;
        }
        union(a,b);
        return false;
    }

    //Krushkal's MST

    void KrushkalMSTFunction(){

    	//Final Result
    	Edge[] resultEdge = new Edge[V-1];
    	for(int i = 0; i < V-1; i++){
    		resultEdge[i] = new Edge();
    	}

    	Arrays.sort(edge);
    	//makeSet for all vertices.
    	for(int i = 0; i < V; i++){
    		makeSet(i);
    	}

    	int count = 0;

    	while(count < V-1){

    		for(Edge e : edge){

    			int a = e.src;
    			int b = e.des;

    			if(!isCycleFormed(a,b)){
    				resultEdge[count] = e;
    				count++;
    			}
    		}
    	}

    	for (int i = 0; i < V-1; i++) 
            System.out.println(resultEdge[i].src+" -- " +  
                  resultEdge[i].des+" == " + resultEdge[i].weight); 

    }

    public static void main(String args[]){

    	KrushkalMST graph = new KrushkalMST(4, 5);
    	// add edge 0-1 
        graph.edge[0].src = 0; 
        graph.edge[0].des = 1; 
        graph.edge[0].weight = 10; 
  
        // add edge 0-2 
        graph.edge[1].src = 0; 
        graph.edge[1].des = 2; 
        graph.edge[1].weight = 6; 
  
        // add edge 0-3 
        graph.edge[2].src = 0; 
        graph.edge[2].des = 3; 
        graph.edge[2].weight = 5; 
  
        // add edge 1-3 
        graph.edge[3].src = 1; 
        graph.edge[3].des = 3; 
        graph.edge[3].weight = 15; 
  
        // add edge 2-3 
        graph.edge[4].src = 2; 
        graph.edge[4].des = 3; 
        graph.edge[4].weight = 4; 
  
  		graph.KrushkalMSTFunction();
    }
	
}
