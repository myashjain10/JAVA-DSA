package JavaDSA.Queues.PriorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class JavaPriorityQueue {
    //observe that the way the queue is stored and the way it is output
    //
    public static void main(String[] args) {
        Queue<Integer> queue =  new PriorityQueue<>();

        queue.add(1);
        queue.add(6);
        queue.add(3);
        queue.add(7);
        queue.add(5);
        System.out.println(queue);

        while(!queue.isEmpty()){
            System.out.print(queue.poll() + " ");
        }
        System.out.println();
    }
}
