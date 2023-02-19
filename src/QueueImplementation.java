import java.util.NoSuchElementException;

public class QueueImplementation {

    private class Node{
        private int value;
        private Node next;
        private Node(int val){this.value = val;}

    }

    private Node first;
    private Node last;

    public void Enqueue(int val){
        var temp = new Node(val);
        if(first == null){
            first = last = temp;
        }
        else{
            last.next = temp;
            last = temp;
        }
    }

    public boolean isEmpty(){
        if (first == null){
            return true;
        }
        return false;
    }

    public void Dequeue(){
        if (isEmpty())
            throw new NoSuchElementException();
        if(first == last){
            first = last = null;
            return;
        }
        Node second = first.next;
        first.next = null;
        first = second;
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
