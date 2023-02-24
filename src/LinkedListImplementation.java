import java.util.NoSuchElementException;

public class LinkedListImplementation {
    private class Node {
        private int value;
        private Node next;

        public Node(int val){
            this.value = val;
        }
    }
    private Node first;
    private Node last;

    int size = 0;
    public void addLast(int val){
        Node temp = new Node(val);
        if (first == null){
            first = temp;
            last = temp;
        }
        else{
            last.next = temp;
            last = temp;
        }
    }

    public void addFirst(int val){
        Node temp = new Node(val);
        if (first == null){
            first = temp;
            last = temp;
        }
        else{
            temp.next = first;
            first = temp;
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



    public int index(int item){
        int index  = 0;
        Node current = first;
        while(current != null) {
            if (current.value == item) {
                return index;
            } else {
                current = current.next;
                index++;
            }
        }
        return -1;
    }

    public boolean contains(int val){
        Node temp = new Node(-1);
        temp = first;
        while(temp != null)
        {
            if(temp.value == val){
                return true;
            }
            else
                temp = temp.next;
        }
        return false;

    }

    public boolean isEmpty(){
        if (first == null){
            return true;
        }
        return false;
    }

    public int size() {
            Node temp;
            size = 0;
            temp = first;
            while (temp != null){
                temp = temp.next;
                size++;
            }
            return size;
        }

    public int[] toArray(){
        int[] array = new int[size];
        var temp = first;
        int index = 0;
        while(temp!=null){
            array[index++] = temp.value;
            temp = temp.next;
        }
        return array;
    }
    public void removeFirst(){
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

    public void remove(int val){
        Node temp = first;
        if (first == last) {
            if (temp.value == val) {
                first = last = null;
            }
        }
            else {
                while (temp != null) {
                    if (temp.next.value == val) {
                        Node del = temp.next;
                        temp.next = del.next;
                        del = null;
                        break;
                    }
                    else{
                        temp = temp.next;
                    }
                }
            }
    }

    public void removeFirst1(){
        if (isEmpty())
            throw new NoSuchElementException();
        if (first == last){
            first = last = null;
            return;
        }
        else{
            Node temp = first;
            first = first.next;
            temp = null;
        }

    }
    public void removeLast(){
        if (isEmpty())
            throw new NoSuchElementException();
        if(first == last){
            first = last = null;
            return;
        }
        Node temp = first;
        while (temp.next != last){
            temp = temp.next;
        }

        temp.next = null;
        last = temp;
    }

    public void reverse(){
        if (isEmpty())
            return;
        var prev = first;
        var curr = first.next;

        while(curr!=null){
            Node second = curr.next;
            curr.next = prev;
            prev = curr;
            curr = second;

        }
        last = first;
        last.next = null;
        first = prev;
    }
}
