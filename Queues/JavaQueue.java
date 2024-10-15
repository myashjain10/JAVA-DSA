package JavaDSA.Queues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class JavaQueue {

    /*
     * add()- adds element to the queue(), throws exception if full
     * 
     * offer() - work similar to add(), but wont throw an exception
     * 
     * remove() - Removes the element from queue(), throws exception if queue is empty
     * poll() - removes the element but returns null if queue is empty
     */
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();//queue can be based on array, linkedlist
        Stack<Integer> stack = new Stack<>();
        //in computer science is known as enqueue - adding new element
        queue.add(1); //front element
        queue.add(2);
        queue.add(3);
        queue.add(4);//rear element

        System.out.println(queue);

        //this is called deque
        System.out.println(queue.remove());//first element will come out
        //removing from empty queue will give exception

        System.out.println("Before reversing: " + queue);

        //reversing queue using stack
        //add all elements of queue to stack
        
        while(!queue.isEmpty()){
            int num = queue.poll();
            stack.push(num);
        }

        //put all the element of stack to queue
        while(!stack.isEmpty()){
            int num = stack.pop();
            queue.offer(num);
        }

        System.out.println("After reversing: " + queue);
    }
}
