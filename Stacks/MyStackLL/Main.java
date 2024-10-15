package MyStackLL;

public class Main {
    public static void main(String[] args) {
        MyStackLL stack = new MyStackLL();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.size());

        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.size());


    }
}
