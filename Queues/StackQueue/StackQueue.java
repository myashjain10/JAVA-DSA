package JavaDSA.Queues.StackQueue;

import java.util.Stack;

public class StackQueue {

    private Stack<Integer> s1;
    private Stack<Integer> s2;
    
    public void StackQueue(){
        this.s1 = new Stack<>();
        this.s2 = new Stack<>();

    }

    public void enqueue(int value){
        s1.push(value);
    }

    public int dequeue(){
        //both stacks are empty
        if(s1.isEmpty() && s2.isEmpty()){
            System.out.println("Queue is Empty");
            return -1;

        }
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

}
