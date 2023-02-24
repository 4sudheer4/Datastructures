import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 1, 1, 2};
        for (var num : numbers) {
            set1.add(num);
        }
        //System.out.println(set);
        repeatedChar obj = new repeatedChar();
        obj.repeatedChar();
    }
}
    class repeatedChar{
        public void repeatedChar(){
            System.out.println("arr");
            var str = "green apple";
            Set<Character> set = new HashSet<>();
            for(var ch: str.toCharArray()){
                if(set.contains(ch)){
                    System.out.println(ch);
                    break;
                }
                else{
                    set.add(ch);
                }

            }

        }

    }

