package MyStack;

public class Main {
    
    public static void main(String[] args) {
        MyStack stack = new MyStack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
       

        System.out.println(stack.size());
    }
}
