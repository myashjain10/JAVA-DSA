package JavaDSA.Queues.MyQueue;
import java.util.Arrays;
public class MyQueue {
    private int[] items;
    private int front;
    private int rear;
    private int size;
    private int count;


    //constructor
    public MyQueue(int capacity){
        this.items = new int[capacity];
        this.front = -1;
        this.rear = 0;
        this.size = capacity;
        this.count = 0;
    }
    //for removing and adding element in queue, we need to use circular queue method
    //where the rear and front variables will be circling over the array

    public void enqueue(int value){
        if(count == size){
            System.out.println("Queue is full");
            return;
        }
        items[rear] = value;
        rear = (rear+1) % size;
        count++;
    }
    
    public int dequeue(){
        
        if(count == 0){
            System.out.println("Queue is empty");
            return -1; 

        };

        front = (front +1) % size; // treating array as circular queue
        int value = items[front];
        items[front] = 0;
        count--;
        return value;
    }


    //overriding toString for printing
    public String toString(){
        return Arrays.toString(items);
    }
}
