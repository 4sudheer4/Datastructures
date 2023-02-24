import java.util.Stack;

public class reverseStringStacks {
    public static void main(String[] args){
        String str = "abcd";

        Stack<Character> rev = new Stack();
        for(int i = 0; i<str.length();i++){
            rev.push(str.charAt(i));
        }
        for (char ch:str.toCharArray()){

        }
        StringBuffer reversed = new StringBuffer();
        while(!rev.empty()){
            reversed.append(rev.pop());
        }

        System.out.println(reversed);
    }
}
