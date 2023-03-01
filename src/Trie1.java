public class Trie1 {
    public static void main(String[] args){
        TrieImplementation trie = new TrieImplementation();
//        trie.insert("cat");
//        trie.insert("caught");
        trie.insertH("care");
        trie.insertH("car");

        System.out.println(trie.contains("car"));

        trie.traverse();
    }
}
