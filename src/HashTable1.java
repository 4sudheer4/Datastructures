import java.util.HashMap;
import java.util.Map;

public class HashTable1 {

    public static void main(String[] args) {

        //Map is an interface and Hashmap is an implementation of this interface
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "josh");
        map.put(3, "josh");
        map.put(2, "josh");
        map.put(4, "josh");
        map.put(4, "Nolan"); //Keys can't be duplicated, new values will overwrite the old ones
        map.put(null,null); //they accept null keys and values
        map.remove(4);
        map.containsKey(3); //O(1)
        map.containsValue("Mosh"); //O(n) (it has to iterate over all the object)
        var val = map.get(3);
        System.out.println(map);
        System.out.println(val);
        //hashmap iterator

        for(var item:map.keySet()) //gives keys
            System.out.println(item);
        for(var item:map.entrySet()) //gives key, value pairs
            System.out.println(item.getValue());

        System.out.println(map.values());
//        HashCollisionImplementation map1 = new HashCollisionImplementation();
//        map1.put(12,"string");
//        System.out.println("inserted");
    }

}
