public class Stack {

    public static void main(String[] args){

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
