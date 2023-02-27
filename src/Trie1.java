public class Trie1 {
    public static void main(String[] args){
        TrieImplementation trie = new TrieImplementation();
//        trie.insert("cat");
//        trie.insert("caught");
        trie.insertH("caught");
        trie.insertH("cat");

        System.out.println(trie.contains("caug"));

        System.out.println(trie.getValues()[0]);
    }
}
