import java.util.*;

public class GraphImplementation {

    public class Node{
        private String label;

        private Node(String label){
            this.label = label;
        }

        public String toString(){
            return label;
        }
    }

    //but list takes O(V) time to traverse inorder to check if a node exists or not. Hence we use Hashmap
    // private List<Node> nodes = new ArrayList<>();

    //map is just to hold the Labels of each vertex and the corresponding NODES.
    private Map<String, Node> nodes = new HashMap<>();

    //stores the NODES and corresponding edge details of each node.
    private Map<Node, List<Node>> adjacencyList = new HashMap<>();

    //this will add edges to the hashmap 'nodes' holding the vertices
    //AND
    //add nodes to the adjacency list holding the respective lists to each node

    //there are two Hashmaps, one is to hold the label and the Node, Second is to hold the Node and the ArrayList to it(storing the edges)

    public void addNode(String label){
        var node = new Node(label);
        //store this node somewhere in the graph
        nodes.putIfAbsent(label, node);
        adjacencyList.putIfAbsent(node,new ArrayList<>());
    }

    public void addEdge(String from, String to){
        var fromNode = nodes.get(from);
        if(fromNode == null)
            throw new IllegalArgumentException();
        var toNode = nodes.get(to);
        if(toNode == null)
            throw new IllegalArgumentException();

        adjacencyList.get(fromNode).add(toNode);
//        adjacencyList.get(toNode).add(fromNode);
    }

    public void print(){
        for (var node: adjacencyList.keySet()){
            var edges = adjacencyList.get(node);
            if(!edges.isEmpty())
                System.out.println(node+" is connected to "+edges);
            }
    }

    public void printEdgesOfNode(String label){
        var node = nodes.get(label);
        List edges = adjacencyList.get(node);
        System.out.println(Arrays.toString(edges.toArray()));
    }

    public void remove(String label){
        var node = nodes.get(label);
        if(node == null){
            return;
        }
        for(var n: adjacencyList.keySet()){
            adjacencyList.get(n).remove(node);
        }
        adjacencyList.remove(node);
        nodes.remove(node);
    }

    public void removeEdge(String from, String to){
        var fromNode = nodes.get(from);
        var toNode = nodes.get(to);
        if(fromNode == null || toNode == null)
            return;
        adjacencyList.get(fromNode).remove(toNode);
    }

    public void DFS(String root){
        DFS(nodes.get(root),new HashSet<>());
    }

    private void DFS(Node root,Set<Node> vis){
        System.out.println(root);
        vis.add(root);
        for(var node: adjacencyList.get(root)){
            if(!vis.contains(node))
                DFS(node,vis);
        }
    }
}

