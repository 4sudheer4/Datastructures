public class BST1 {

    public static void main(String[] args){
        BSTImplementation tree = new BSTImplementation();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);
        var list = tree.dist(0);
        for(var item: list){
            System.out.println(item);
        }
        BSTImplementation tree2 = new BSTImplementation();
        tree2.insert(1);
        tree2.insert(7);
        tree2.insert(6);
        tree2.insert(9);
        tree2.insert(8);
        tree2.insert(4);
        tree2.insert(10);

//        System.out.println("traversePreorder");
//        tree.traversePreorder();
//        System.out.println("traverseInorder");
//        tree.traverseInorder();
//        System.out.println("traversePostorder");
//        tree.traversePostorder();
//        System.out.println("height of the tree");
//        System.out.println(tree.height());
//        tree.traverseLevelOrder();
        System.out.println(tree.countLeaves());
//        var res = tree.find(9);
//        System.out.println(res);
//        System.out.println(tree.equals(tree2));

    }
}
