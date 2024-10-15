
import java.util.Stack;
public class MinStack {


    Stack<Integer> stack;
    Stack<Integer> tempStack;
    public void MinStack(){
        this.stack = new Stack();
        this.tempStack = new Stack();
    }

    public void push(int value){

        stack.push(value);

        if(tempStack.isEmpty() || value <= tempStack.peek()){
            tempStack.push(value);
        }

    }

    public int pop(){
        int num = stack.pop();
        if (num == tempStack.peek()){
            tempStack.pop();
        }
        return num;
    }

    public int peek(){
        return stack.peek();
    }

    public int getMin(){

        return tempStack.peek();
    }
}
