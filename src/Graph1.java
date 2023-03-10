public class Graph1 {

    public static void main(String args[]){
        var graph = new GraphImplementation();
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("D");
        graph.addEdge("A","B");
        graph.addEdge("B","D");
        graph.addEdge("B","C");
        graph.addEdge("A","C");
        graph.printEdgesOfNode("A");
        //graph.removeEdge("A","B");
//        graph.remove("B");
        graph.DFS("A");
        graph.DFSIterate("A");
        graph.print();

    }
}
