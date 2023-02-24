import java.security.KeyStore;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Map;

public class LinkedList1 {

    public static void main(String[] args){
        LinkedList list = new LinkedList();
        LinkedList<Map.Entry>[] list12 = new LinkedList[5];
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        LinkedListImplementation list1 = new LinkedListImplementation();
        list1.addFirst(10);
        list1.addFirst(20);
        list1.addFirst(30);
        list1.addFirst(40);
        list1.addFirst(50);
        list1.addFirst(60);
        list1.addFirst(70);
        list1.print();
        list1.addFirst(80);
        list1.print();
//        int index = list1.index(10);
//        System.out.println(index);
//        //list1.removeFirst();
//        //list1.removeLast();
        list1.remove(30);
//        int index1 = list1.index(10);
//        boolean res = list1.contains(39980);
//        list1.print();
          int size = list1.size();
        var array1 = list1.toArray();
          list1.reverse();
          var array = list1.toArray();
          list1.print();
          System.out.println(Arrays.toString(array1));
          System.out.println(Arrays.toString(array));

          System.out.println(size);


    }
}
