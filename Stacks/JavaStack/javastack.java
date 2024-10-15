import java.util.Stack;

class JavaStack{
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        // traversing the stack
        while(!stack.isEmpty()){
            Integer value = stack.peek(); //peek() just returns the top element but does not remove it;
            stack.pop();//pop() removes the top element and returns it
            System.out.println(value);
        }

    }


}
