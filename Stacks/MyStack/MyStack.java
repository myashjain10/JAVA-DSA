package MyStack;

import java.util.EmptyStackException;

public class MyStack {
    private int[] items;
    private int top;// point to top of the stack
    private int size;

    public MyStack(int size){
        this.size = size;
        this.items = new int[size];
        this.top = 0;
    }

    public void push(int value){
        if(top == this.size){
            throw new StackOverflowError();
        }
        this.items[this.top] = value;
        this.top++;
    }

    public int size(){
        return top;
    }


    public int pop(){
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        this.top--;
        int value = items[top];
        items[top]= 0;
        return value;
    }

    public int peek(){
        if(isEmpty()){
            return 0;
        }

        return items[top-1];
    }

    public boolean isEmpty(){
        if(top==0){
            return true;
        }
        return false;
    }
    public String toString(){
        StringBuilder outputString = new StringBuilder();
        for(int i=size -1; i>=0; i--){
            outputString.append(items[i]).append("\n");

        }
        return outputString.toString();
    }
}
