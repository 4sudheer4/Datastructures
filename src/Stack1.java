import java.util.Stack;
public class Stack1 {

    public static void main(String[] args){

        Stack<Integer> stack1 = new Stack();
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        stack1.push(40);
        stack1.push(50);
        stack1.pop();
        System.out.println(stack1);



        StackImplementation stack = new StackImplementation();
        stack.Push(12);
        stack.Push(14);
        stack.Push(15);
        stack.Push(16);
        stack.print();
        stack.Pop();
        stack.Pop();
        stack.Pop();
        stack.Pop();

        stack.print();
    }
}
