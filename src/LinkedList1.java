import java.util.LinkedList;

public class LinkedList1 {

    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        LinkedListImplementation list1 = new LinkedListImplementation();
        list1.addFirst(10);
        list1.addFirst(20);
        list1.addFirst(30);
        int index = list1.index(10);
        System.out.println(index);
        //list1.removeFirst();
        //list1.removeLast();
        list1.remove(20);
        int index1 = list1.index(10);
        boolean res = list1.contains(39980);
        list1.print();


    }
}
