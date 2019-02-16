
package DijikstraAlgorithm;

public class AppDijikstra {

    public static void main(String args[]) {

        VertexDijikstra v1 = new VertexDijikstra("A");
        VertexDijikstra v2 = new VertexDijikstra("B");
        VertexDijikstra v3 = new VertexDijikstra("C");
        VertexDijikstra v4 = new VertexDijikstra("D");

        v1.addEdge(new EdgeDijikstra(1, v1, v2));
        v1.addEdge(new EdgeDijikstra(2, v1, v4));
        v1.addEdge(new EdgeDijikstra(3, v1, v3));

        v2.addEdge(new EdgeDijikstra(1, v2, v3));
        v3.addEdge(new EdgeDijikstra(1, v3, v4));

        Dijikstra dijikstra = new Dijikstra();

        dijikstra.computePaths(v1);

        /*
         * Expected Output 
         * [A, B] 
         * [A, B, C]
         * [A, D]
         */
        System.out.println(dijikstra.getShortestPathTo(v2));
        System.out.println(dijikstra.getShortestPathTo(v3));
        System.out.println(dijikstra.getShortestPathTo(v4));

    }
}
