import java.util.HashMap;

public class TrieImplementation {

    private class Node{
        char value;
        //created an array of nodes to store all the next coming children nodes. For example in 'CAT' if current node is 'C' it can have 'A' in the next children node.
        private Node[] children = new Node[26];
        private HashMap<Character, Node> childrenH = new HashMap<>();
        boolean endOfTheWord;
        private Node(char value){
            this.value = value;
        }
        private boolean hasChild(char ch){
            return childrenH.containsKey(ch);
        }

        private void addChild(char ch){
            childrenH.put(ch, new Node(ch));
        }

        //returns value of the childrenHash, which is a Node. Hash has <Key: ch, Value: Node>
        private Node getChild(char ch){
            return childrenH.get(ch);
        }

        public Node[] getValues(){
            return childrenH.values().toArray(new Node[0]);
        }
    }


    private Node root = new Node(' ');

    public void insertH(String word){
    Node current = root;
    for (char ch: word.toCharArray()){
        if(!current.hasChild(ch))
            current.addChild(ch);
       /* if(current.childrenH.get(ch)==null)
            current.childrenH.put(ch,new Node(ch));
        */
        current = current.getChild(ch);
    }
        current.endOfTheWord = true;
    }

    public void insert(String word){
        var current = root;
        for (char val:word.toCharArray()){
            int i = val - 'a';
            if(current.children[i]==null)
                current.children[i] = new Node(val);
            current = current.children[i];
        }
        current.endOfTheWord = true;

    }

    public void traverse(){
        traverse(root);
    }
// here 'a' has two hash maps in the give example of 'cat' and 'caught'
    private void traverse(Node root){

        for(var child: root.getValues()){
            traverse(child);
        }
        System.out.println(root.value);
    }

    public void remove(String word){
        remove(word.toCharArray(),root,0);
    }
    private void remove(char[] word,Node root,int index){

        for(var child: root.getValues()){
            if(index>=word.length)
                break;
            if(word[index]== child.value)
                remove(word,child,index+1);

        }

        System.out.println(root.value);
    }
    public boolean contains(String word){
        if (word == null){
            return false;
        }
        Node current = root;
        for(var ch: word.toCharArray()){
            if(current.getChild(ch)!=null){
                current = current.getChild(ch);
            }
            else
                return false;
        }
        return current.endOfTheWord;

    }
}
