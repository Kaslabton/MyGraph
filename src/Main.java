public class Main {
    public static void main(String[] args) {
        MyGraph g = new MyGraph();
        g.insertVertex("A");
        g.insertVertex("B");
        /*g.insertVertex("C");
        g.insertVertex("D");
        g.insertVertex("E");
        g.insertVertex("F");
        g.insertVertex("G");
        g.insertVertex("H");
        g.insertVertex("I");
        g.insertVertex("J");
        g.insertVertex("K");
        g.insertVertex("L");
        g.insertVertex("M");
        g.insertVertex("N");
        g.insertVertex("O");
        g.insertVertex("P");*/
        g.insertEdge("A","B", "1");

        g.print();
        System.out.println("Num Vertices: " + g.numVertices());
        System.out.println("Num Edges: " + g.numEdges());
    }
}