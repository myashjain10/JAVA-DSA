package JavaDSA.Queues.MyQueue;

public class Main {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(3);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        //queue.enqueue(4);//will throw exception/return a msg
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        
        System.out.println(queue);
    }
}
