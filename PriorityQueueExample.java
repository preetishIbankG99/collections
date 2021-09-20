package collectionsamples;

import java.util.Iterator;
import java.util.PriorityQueue;
//queue interface orders element in fifo
//first element is removed first and last removed last
public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<String>pq=new PriorityQueue<>();
        pq.add("Amit");
        pq.add("Jatin");
        pq.add("Bijay");
        pq.add("karan");
        System.out.println("head: "+pq.element());
        System.out.println("head: "+pq.peek());
        //remove
        pq.remove();
        pq.poll();
        Iterator itr=pq.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
