import java.util.HashMap;
import java.util.Map;

public class HashTable1 {

    public static void main(String[] args) {

        //Map is an interface and Hashmap is an implementation of this interface
        Map<Integer, String> map = new HashMap<>();

        /* To insert <key, value> pairs into HashMap use .PUT(K,V) */
        map.put(1, "josh");
        map.put(3, "josh");
        map.put(2, "josh");
        map.put(4, "josh");
        map.put(4, "Nolan"); //Keys can't be duplicated, new values will overwrite the old ones
        map.put(null,null); //they accept null keys and values

        /* To get value of a Given Key use .get(KEY) */
        var val = map.get(3);


        /* To remove Key from a map use .remove(KEY) */
        map.remove(4);

        /* To check if a key is available or not in hashMap key set USE .containsKey(KEY) */
        map.containsKey(3); //O(1)

        /* To check if a key is available or not in hashMap Value set, USE .containsValue(KEY) */
        map.containsValue("Mosh"); //O(n) (it has to iterate over all the object)



        System.out.println(map);
        System.out.println(val);
        //hashmap iterator
        System.out.println("get value");
        //in hashmap, get is used to get the value of a Key in the Map. Where getValue() is used to get value from the .entrySet() [which returns key,value pairs]
        System.out.println(map.get(3));
        for(var item:map.keySet()) //gives keys
            System.out.println(item);
        for(var item:map.entrySet()) //gives key, value pairs
            System.out.println(item.getValue());

        /* WIll provide all the value in the HashMap*/
        System.out.println(map.values());

//        HashCollisionImplementation map1 = new HashCollisionImplementation();
//        map1.put(12,"string");
//        System.out.println("inserted");
    }


}
