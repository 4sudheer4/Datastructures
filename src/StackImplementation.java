import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class StackImplementation {

    //has two operations, push and pull.
    //LIFO
    //used in text editors undo, compiler for syntax, recursion -keepoing track of previous function calls, DFS
    //push, pop,peek,size has O(1) where searching has O(n)
    //

    private class Node {
        private int value;
        private Node next;

        public Node(int val){
            this.value = val;
        }
    }
    private Node first;
    private Node last;

    public void Push(int val){
        var temp = new Node(val);
        if(first == null){
            first = last = temp;
        }
        else{
            last.next = temp;
            last = temp;
        }
    }

    public void Pop(){
        if (first == null){
            throw new EmptyStackException();
        }
      Node temp = first;

      if(first == last){
          first = last = null;
      }
      else{
          while (temp != null){
              if(temp.next == last){

                  last = temp;
                  temp.next = null;
                  break;
              }
              else{
                  temp = temp.next;
              }
          }
      }

    }
    public void print(){
        Node temp;
        temp = first;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }

    }



}
