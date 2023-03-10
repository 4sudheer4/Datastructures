import java.util.ArrayList;

public class BSTImplementation {

    private class Node {
        private int value;
        private Node right;
        private Node left;

        private Node(int value) {
            this.value = value;
        }
    }
        private Node root;

        public void insert(int value){
            var temp = new Node(value);
            if (root == null){
                root = temp;
                return;
            }
            Node current = root;
            while(true){
                if(value<current.value){
                    if(current.left == null){
                        current.left = temp;
                        break;
                    }
                    current = current.left;
                }
                else{
                    if(current.right == null){
                        current.right = temp;
                        break;
                    }
                    current = current.right;
                }
            }
        }

        public boolean find(int value){
            var temp = root;
            while(temp!=null){
                if (value == temp.value){
                    return true;
                }
                if (value < temp.value){
                    temp = temp.left;
                }
                if (value > temp.value){
                    temp = temp.right;
                }
            }
            return false;
        }

        //display all the nodes at a specific distance from root node.
    public ArrayList dist(int dist){
            var list = new ArrayList<Integer>();
             dist(root, dist,list);
             return list;
    }

        //get all nodes from a given distance from root
        public void dist(Node root, int dist,ArrayList<Integer> list){
            if(root == null){
                return;
            }
            if (dist == 0){
                list.add(root.value);
            }
            else{
                dist(root.left,dist-1,list);
                dist(root.right,dist-1,list);
            }
        }

        //BFS traversal. Traverse nodes at level by level
        public void traverseLevelOrder(){
            for (int i=0; i<=height();i++){
                for (var item:dist(i)){
                    System.out.println(item);
                }
            }
        }
        //get height of the tree
        public int height(){
            return height(root);
        }
        public int height(Node root){
            if (root == null){
                return -1;
            }
            if (root.left == null && root.right == null){
                return 0;
            }
            return 1+Math.max(height(root.left),height(root.right ));
        }


        //check if two trees are same or not
        public boolean equals(BSTImplementation Tree){
            if(Tree == null){
                return false;
            }
            return equals(root,Tree.root);
        }
        private boolean equals(Node first, Node second){
            if(first == null && second == null){
                return true;
            }
            if(first != null && second != null)
                return (first.value == second.value) && equals(first.left,second.left) && equals(first.right, second.right);
            return false;
        }

        //check if the given tree is BST
        public boolean checkBst(BSTImplementation Tree){
            return checkBst(Tree.root,-1000000,1000000);
        }
        private boolean checkBst(Node root, int min, int max){
            if (root == null){
                return true;
            }
            if (root.value<min || root.value > max){
                return false;
            }
            return (checkBst(root.left,min,root.value-1 )) && (checkBst(root.right,root.value+1,max));
        }


        //count leaves in a tree
        public int countLeaves(){
            return countLeaves(root,0);
        }
        private int countLeaves(Node root,int count){
            if(root.left == null && root.right == null)
                return 1;

            return countLeaves(root.left,count)+countLeaves(root.right,count);

        }
        //find min value node in the tree
        public int min(){
            return min(root);
    }
        public int min(Node root){
            if(root.left == null && root.right == null) {
                return root.value;
            }
            var leftmin = min(root.left);
            var rightmin = min(root.right);
            return Math.min(Math.min(leftmin, rightmin),root.value);
        }
        public void traversePreorder(){
            traversePreorder(root);
        }
        public void traversePreorder(Node root){
            if (root == null)
                return;
            //root
            System.out.println(root.value);
            //left
            traversePreorder(root.left);
            //right
            traversePreorder(root.right);
        }

    public void traverseInorder(){
        traverseInorder(root);
    }
    public void traverseInorder(Node root){
        if (root == null)
            return;
        //left
        traverseInorder(root.left);
        //root
        System.out.println(root.value);
        //right
        traverseInorder(root.right);
    }

    public void traversePostorder(){
        traversePostorder(root);
    }
    public void traversePostorder(Node root){
        if (root == null)
            return;
        //left
        traversePostorder(root.left);
        //right
        traversePostorder(root.right);
        //root
        System.out.println(root.value);
    }
    }
