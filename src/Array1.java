import java.util.ArrayList;
import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {

        int[] numbers = {10,20,30};
        numbers[0] = 10;
        int k = numbers.length;
        System.out.println(Arrays.toString(numbers));

        ArrayImplementation numberss = new ArrayImplementation(3);
        numberss.insert(1);
        numberss.insert(2);
        numberss.insert(3);
        numberss.insert(4);
        numberss.removeAt(1);
        numberss.removeAt(1);
        numberss.print();
        ArrayList<Integer> List = new ArrayList<>();
        List.add(10);
        List.add(20);
        List.remove(0);
        List.size();
        List.toArray();

        System.out.println(List);
    }
}