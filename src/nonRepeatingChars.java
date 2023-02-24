import java.util.HashMap;
import java.util.Map;

public class nonRepeatingChars {
    public static void main(String[] args) {
        String str = "a green apple";
        Map<Character, Integer> map = new HashMap<>();
        for (var ch : str.toCharArray()) {
            if (map.containsKey(ch)) {
                var count = map.get(ch);
                map.put(ch, count + 1);
            } else {
                map.put(ch, 1);
            }
        }
        System.out.println(map);
        for (var ch : str.toCharArray()) {
            if(map.get(ch)==1){
                System.out.println(ch);
                break;
            }
        }
    }
}
